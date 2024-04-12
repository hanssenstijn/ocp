package org.example.ch4;

import java.time.*;

public class Datez {
    public static void main(String[] args) {
        System.out.println("LocalDate " + LocalDate.now());
        System.out.println("LocalTime " + LocalTime.now());
        System.out.println("LocalDateTime " + LocalDateTime.now());
        System.out.println("Zone " + ZonedDateTime.now());

        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        var date2 = LocalDate.of(2022, 1, 20);

        var time1 = LocalTime.of(6, 15);
        var time2 = LocalTime.of(6, 15, 30);
        var time3 = LocalTime.of(6, 15, 30, 200);

        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date1, time1);

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30, 200, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);

        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println("plusDays : " + date);
        date = date.plusWeeks(1);
        System.out.println("plusWeeks : " + date);
        date = date.plusMonths(1);
        System.out.println("plusMonths : " + date);
        date = date.plusYears(1);
        System.out.println("plusYears : " + date);

        var time = LocalTime.of(5, 15);
        System.out.println("Time : " + time);
        var dateTime = LocalDateTime.of(date, time).minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println("dateTime : " + dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println("minusDays : " + dateTime);
        dateTime = dateTime.minusHours(1);
        System.out.println("minusHours : " + dateTime);
        dateTime = dateTime.minusSeconds(1);
        System.out.println("minusSeconds : " + dateTime);

        // does not compile
        // date.plusMinutes(1);

        var start = LocalDate.of(2022,Month.JANUARY,1);
        var end = LocalDate.of(2022,Month.MARCH,30);
        var period = Period.ofMonths(1);
        System.out.println("period : " + period);
        performAnimalEnrichment(start,end,period);

        var annually = Period.ofYears(1);
        var quarterly = Period.ofMonths(3);
        var everyThreeWeeks = Period.ofWeeks(3);
        var everyOtherDay = Period.ofDays(2);
        var everyYearAndAWeek = Period.of(1,0,7);

        // cannot chain methods in period, it will only use the last
        var wrong = Period.ofYears(1).ofWeeks(1);
        var wrong2 = Period.ofYears(1);
        wrong2 = wrong2.ofWeeks(1);

        // period format
        System.out.println("period format : " + Period.of(1,2,3));

        System.out.println("plus(period) : " + date.plus(period));
        System.out.println("plus(period) : " + dateTime.plus(period));
        // exception
        // System.out.println(time.plus(period));

        var daily = Duration.ofDays(1);
        System.out.println("daily : " + daily);
        var hourly = Duration.ofHours(1);
        System.out.println("hourly : " + hourly);
        var everyMinute = Duration.ofMinutes(1);
        System.out.println("everyMinute : " + everyMinute);
        var everyTenSeconds = Duration.ofSeconds(10);
        System.out.println("everyTenSeconds : " + everyTenSeconds);
        var everyMilli = Duration.ofMillis(1);
        System.out.println("everyMilli : " + everyMilli);
        var everyNano = Duration.ofNanos(1);
        System.out.println("everyNano : " + everyNano);

        // Duration does not work on date
        // date = date.plus(daily);
        // System.out.println(date);

        var now = Instant.now();
        System.out.println("Instant : " + now);
        var later = Instant.now();

        var duration = Duration.between(now,later);
        System.out.println("between : " + duration);
        System.out.println("between toMillis : " + duration.toMillis());


    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        var upTo = start;
        while(upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
