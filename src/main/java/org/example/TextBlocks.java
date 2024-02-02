package org.example;

public class TextBlocks {
    public static void main(String[] args) {
        String s = " \" Java \" \n by Java ";
        System.out.println(s);

        String x = """ 
               "this is a string block"
               by java """;
        System.out.println(x);
        TextBlocks.y();

    }
    // \s keep the whitespace (next line)
    // \ skip the linebreak (same line)
    static void y() {
        var blocky = """
                squirrel \s
                pigeon \
                termite
                """;
        System.out.println(blocky);
    }
}
