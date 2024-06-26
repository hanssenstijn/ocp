package org.example.ch9;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<>();
        // does not compile
        // List<> list3 = new ArrayList<Integer>();

        // add returns a boolean, list accepts duplicates
        System.out.println("list.add(\"Sparrow\") : " + list.add("Sparrow"));
        System.out.println("list.add(\"Sparrow\") : " + list.add("Sparrow"));

        // sets don't accept duplicates
        Collection<String> set = new HashSet<>();
        System.out.println("set.add(\"Sparrow\") : " + set.add("Sparrow"));
        System.out.println("set.add(\"Sparrow\") : " + set.add("Sparrow"));

        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println("birds : " + birds);
        System.out.println("birds.remove(\"cardinal\") : " + birds.remove("cardinal"));
        System.out.println("birds.remove(\"hawk\") : " + birds.remove("hawk"));
        System.out.println("birds : " + birds);
        System.out.println("birds.isEmpty() : " + birds.isEmpty());
        System.out.println("birds.size() : " + birds.size());

        birds.clear();
        System.out.println("birds.isEmpty(), after clear : " + birds.isEmpty());
        System.out.println("birds.size(), after clear : " + birds.size());

        birds.add("hawk");
        System.out.println("birds.contains(\"hawk\") : " + birds.contains("hawk"));
        System.out.println("birds.contains(\"robin\") : " + birds.contains("robin"));

        Collection<String> list3 = new ArrayList<>();
        list3.add("Magician");
        list3.add("Assistant");
        System.out.println(list3);
        list3.removeIf(s -> s.startsWith("A"));
        System.out.println(list3);

        Collection<String> set2 = new HashSet<>();
        set2.add("Wand");
        set2.add("");
        set2.removeIf(String::isEmpty);
        System.out.println("set2.removeIf(String::isEmpty) : " + set2);

        Collection<String> cats = List.of("Annie","Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));

        var list4 = List.of(1,2);
        var list5 = List.of(2,1);
        var set3 = Set.of(1,2);
        var set4 = Set.of(2,1);
        // order is important
        System.out.println("list4.equals(list5) : " + list4.equals(list5));
        System.out.println("set3.equals(set4) : " + set3.equals(set4));
        // false since types are different
        System.out.println("list4.equals(set3) : " + list4.equals(set3));

        String[] array = new String[] {"a","b","c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);
        System.out.println("asList : " + asList);
        System.out.println("of : " + of);
        System.out.println("copy : " + copy);

        array[0] = "z";

        // only as list can replace elements!
        System.out.println("asList : " + asList);
        System.out.println("of : " + of);
        System.out.println("copy : " + copy);

        asList.set(0,"x");
        System.out.println("asList : " + asList);

        // create one with defaults
        var linked1 = new LinkedList<String>();
        // make a copy
        var linked2 = new LinkedList<String>(linked1);

        var list6 = new ArrayList<String>();
        var list7 = new ArrayList<String>(list6);
        // capacity
        var list8 = new ArrayList<String>(10);

        List<String> list9 = new ArrayList<>();
        list9.add("SD");
        System.out.println(list9);
        list9.add(0,"NY");
        System.out.println(list9);
        list9.set(1,"FL");
        System.out.println(list9);
        System.out.println(list9.get(0));
        list9.remove("NY");
        list9.remove(0);
        System.out.println(list9);

        var numbers = Arrays.asList(1,2,3);
        numbers.replaceAll(x -> x*2);
        System.out.println(numbers);

        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("objectArray.length : " + objectArray.length);

        Set<Character> letters = Set.of('z','o','o');
        Set<Character> copySet = Set.copyOf(letters);

        Set<Integer> set5 = new HashSet<>();
        set5.add(10);
        set5.add(1);
        // duplicate element not allowed
        // set5.add(10);
        set5.forEach(System.out::println);


    }
}
