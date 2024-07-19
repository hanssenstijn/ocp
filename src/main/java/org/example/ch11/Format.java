package org.example.ch11;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;

public class Format {
    public static void main(String[] args) throws ParseException {
        double d = 1234.567;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d));

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d));

        NumberFormat f3 = new DecimalFormat("You Balance $#,###,###.##");
        System.out.println(f3.format(d));

        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
        System.out.println("date.getDayOfWeek() : " + date.getDayOfWeek());
        System.out.println("date.getMonth() : " + date.getMonth());
        System.out.println("date.getYear() : " + date.getYear());
        System.out.println("date.getDayOfYear() : " + date.getDayOfYear());

        LocalTime time = LocalTime.of(11, 22, 34);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);

        System.out.println("date.format(DateTimeFormatter.ISO_LOCAL_DATE) : " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("time.format(DateTimeFormatter.ISO_LOCAL_TIME) : " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("localDateTime.format(DateTimeFormatter.ISO_DATE_TIME) : " + localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println("localDateTime.format(f) : " + localDateTime.format(f));

        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println("localDateTime.format(formatter1) : " + localDateTime.format(formatter1));

        System.out.println("formatter1.format(localDateTime) : " + formatter1.format(localDateTime));

        var ff = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println("MMMM dd, yyyy 'at' hh:mm : " + localDateTime.format(ff));

        Locale locale = Locale.getDefault();
        System.out.println("Locale.getDefault() : " + locale);
        System.out.println("Locale.GERMAN : " + Locale.GERMAN);
        System.out.println(new Locale("hi", "IN"));

        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println("NumberFormat.getInstance(Locale.US) : " + us.format(attendeesPerMonth));

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println("NumberFormat.getInstance(Locale.CANADA_FRENCH) : " + ca.format(attendeesPerMonth));

        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println("NumberFormat.getCurrencyInstance() : " + myLocale.format(price));

        double successRate = 0.802;
        var usus = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(usus.format(successRate));

        String s = "40.45";
        var en = NumberFormat.getInstance(Locale.US);
        System.out.println("NumberFormat.getInstance(Locale.US); : " + en.parse(s));

        var formatters = Stream.of(NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(),NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(),NumberFormat.Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT));

        formatters.map(sss -> sss.format(7_123_456)).forEach(System.out::println);

        new Format().print(100_102.2);

        // need single quotes
        var fff = DateTimeFormatter.ofPattern("hh' o ''clock'");
        // pay attention that it must include a time, so onnly date would throw runtime exception
        System.out.println(fff.format(LocalTime.now()));
        System.out.println(fff.format(ZonedDateTime.now()));
        System.out.println(fff.format(LocalTime.now()));
    }

    public void print(double t) {
        System.out.println(NumberFormat.getCompactNumberInstance().format(t));
        System.out.println(NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT).format(t));
        System.out.println(NumberFormat.getCurrencyInstance().format(t));

    }
}
