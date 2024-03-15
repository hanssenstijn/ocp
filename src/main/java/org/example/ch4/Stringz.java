package org.example.ch4;

public class Stringz {
    public static void main(String[] args) {
        // two ways to initialize strings, both are different and dont refer to same object
        String name = "fully";
        String name2 = new String("fully");
        String name3 = """
                fluffy""";

        // reference
        System.out.println("== " + name == name2);
        System.out.println("== " + name2 == name3);
        // object content
        System.out.println("equals " + name.equals(name2));
        System.out.println("equals " + name2.equals(name3));

        System.out.println("\"a\" + \"b\" + 3 : ");
        System.out.println("a" + "b" + 3);
        System.out.println("1 + 2 + \"c\" : ");
        System.out.println(+1 + 2 + "c");
        System.out.println("\"c\" + 1 + 2 : ");
        System.out.println("c" + 1 + 2);

        int three = 3;
        String four = "4";
        System.out.println("1 + 2 + three + four : ");
        System.out.println(1 + 2 + three + four);

        // += operand can also be used on string
        var s = "1";
        s += "2";
        s += 3;

        System.out.println("var s = \"1\";\n" +
                "        s += \"2\";\n" +
                "        s += 3; :" + s);

        var x = "animals";
        System.out.println("x length : " + x.length());
        System.out.println("index 0 " + x.charAt(0));
        System.out.println("index 6 " + x.charAt(6));
        // exception since index start at 0
        // System.out.println(x.charAt(7));

        System.out.println("indexof : " + x.indexOf('a'));
        System.out.println("indexof fromindex : " + x.indexOf('a', 4));
        System.out.println("indexof : " + x.indexOf("al"));
        System.out.println("indexof fromindex returns -1 if invalid : " + x.indexOf("al", 5));

        System.out.println("substring : " + x.substring(3));
        // empty string
        System.out.println("substring : " + x.substring(3, 3));
        // exception
        // System.out.println("substring : " + x.substring(3,2));
        System.out.println("substring : " + x.substring(3, 4));
        // can include last letter
        System.out.println("substring : " + x.substring(3, 7));
        System.out.println("substring : " + x.substring(x.indexOf('l')));

        System.out.println("toUpperCase : " + x.toUpperCase());
        System.out.println("string immutable original stays the same: " + x);
        System.out.println("toLowerCase : " + "ABC".toLowerCase());

        System.out.println("equals : " + "abc".equals("ABC"));
        System.out.println("equalsIgnoreCase : " + "abc".equalsIgnoreCase("ABC"));
        System.out.println("equals : " + "ABC".equals("ABC"));

        // its camelcase sensitive
        System.out.println("startsWith : " + "abc".startsWith("a"));
        System.out.println("startsWith : " + "abc".startsWith("A"));
        System.out.println("endsWith : " + "abc".endsWith("C"));
        System.out.println("endsWith : " + "abc".endsWith("A"));
        System.out.println("contains : " + "abc".contains("b"));
        System.out.println("contains : " + "abc".contains("B"));

        System.out.println("replace : " + "abcabc".replace('a', 'A'));
        System.out.println("replace : " + "abcabc".replace("a", "A"));

        String y = "\t a b c \n";
        // remove whitespaces, also includes (\t \n \r)
        System.out.println("trim : " + y.trim());
        System.out.println("strip : " + y.strip());
        // remove at the beginning, so still include the whitespace \n
        System.out.println("stripLeading : " + y.stripLeading());
        // remove at the end, so still include the \t
        System.out.println("stripTrailing : " + y.stripTrailing());

        var str = "1\\t2";
        System.out.println(str);
        System.out.println("translateEscapes : " + str.translateEscapes());

        System.out.println("isEmpty : " + " ".isEmpty());
        System.out.println("isEmpty : " + "".isEmpty());
        System.out.println("isBlank : " + " ".isBlank());
        System.out.println("isBlank : " + "".isBlank());

    }
}
