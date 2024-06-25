package org.example.ch9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

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


    }
}
