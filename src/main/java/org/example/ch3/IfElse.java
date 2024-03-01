package org.example.ch3;

public class IfElse {
    public static void main(String[] args) {
        int temp = 4;
        long humidity = -temp + temp * 3;
        if(temp>=4)
            if(humidity < 6) System.out.println("Too low");
        else System.out.println("Just Right");
        else System.out.println("Too High");
    }
}
