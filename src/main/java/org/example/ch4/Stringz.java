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

        var kate = "kate";
        var orderId = 5;

        System.out.println(String.format("Hello %s, order %d is ready",kate,orderId));
        System.out.println(String.format("Hello %s, order %n %d is ready",kate,orderId));
        System.out.println("Hello %s, order %d is ready".formatted(kate,orderId));

        var james = "james";
        var score = 90.25;
        var total = 100;

        System.out.println("%s: %n   Score: %f out of %d".formatted(james,score,total));
        System.out.println("%s: %n   Score: %.1f out of %d".formatted(james,score,total));
        System.out.println("%s: %n   Score: %.2f out of %d".formatted(james,score,total));

        // IllegalFOrmatConversionExeption
        // var strstr = "Food %d tons".formatted(2.0);

        var pi = 3.14159265359;
        System.out.println(String.format("[%f]",pi));
        System.out.println(String.format("[%12.8f]",pi));
        System.out.println(String.format("[%012f]",pi));

        String result = "AniMaL     ".trim().toLowerCase().replace('a','A');
        System.out.println(result);

        String b = "abc".toUpperCase();
        b = b.replace("B","2").replace("C","3");
        System.out.println(b);

        // only one object, since once new StringBuilder
        StringBuilder a = new StringBuilder("abc");
        StringBuilder c = a.append("de");
        c = c.append("f").append("g");
        System.out.println("StringBuilder : " + a);
        System.out.println("StringBuilder : " + c);

        // empty one
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("abc");
        // capacity
        StringBuilder sb3 = new StringBuilder(10);

        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"),sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        // convert directly to string
        var sb4 = new StringBuilder().append(1).append('c');
        sb4.append("-").append(true);
        System.out.println(sb4);

        sb.insert(7,"-");
        System.out.println(sb);
        sb.insert(0,"-");
        System.out.println(sb);
        sb.insert(4,"-");
        System.out.println(sb);

        sb.delete(1,3);
        // can also be out of array index
        sb.delete(1,100);
        System.out.println(sb);
        // exception index out of bounds
        // sb.deleteCharAt(10);

        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3,6,"sty");
        System.out.println("replace : " + builder);

        builder.reverse();
        System.out.println("reverse : " + builder);

        String sss = builder.toString();
        System.out.println("toString : " + sss);

        var one = new StringBuilder();
        var two = new StringBuilder();
        var five = one.append("a");
        System.out.println("== StringBuilder : " + (one == two));
        System.out.println("== StringBuilder : " + (one == five));

        var xy = "Hello world";
        var yx = " Hello world".trim();
        System.out.println("equals : " + xy.equals(yx));
        System.out.println("== : " + xy == yx);
        // tell the jvm to make use of the string pool (use object from here if present) therefor true now
        System.out.println("intern() : " + xy == yx.intern());

        var d = "d";
        var e = new StringBuilder(d);
        // compilation error, since two different types
        // System.out.println(d == e);

        var first = "ab";
        var second = new String("ab");
        System.out.println("new String() : " + first == second);

        var ssss = "Hello";
        var t = new String(ssss);
        System.out.println("intern() : " + t.intern()==ssss);

        
        builder.replace(2,4,"5").charAt(2);
        // not s.length
        s.length();

        var numbers = "012345678".indent(1);
        System.out.println("indent : " + numbers);
        numbers = numbers.stripLeading();
        System.out.println("stripLeading : " + numbers);
   }
}
