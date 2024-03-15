package org.example.ch1;

public class TextBlocks {
    public static void main(String[] args) {
        String s = " \" Java \" \n by Java ";
        System.out.println(s);

        String x = """ 
               "this is a string block"
               by java """;
        System.out.println(x);
        TextBlocks.y();


        // 3 characters, 3 lines
        var block = """
                a
                b
                c 
                """;
        System.out.println(block.length());
        // add whitespace for each line thus plus 3
        System.out.println(block.indent(1).length());
        System.out.println(block.indent(2).length());
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
