package org.example.ch14;

import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        System.out.println("Hello, " + name);
    }
}
