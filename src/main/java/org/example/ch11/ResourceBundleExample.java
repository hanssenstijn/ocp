package org.example.ch11;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        // Set the default local, if you dont set this one it would print out different values
        Locale.setDefault(new Locale("fr", "FR"));

        // Load the resource bundle for the default locale
        ResourceBundle bundle = ResourceBundle.getBundle("messages");

        // Retrieve values using keys
        String greeting = bundle.getString("greeting");
        String farewell = bundle.getString("farewell");

        System.out.println(greeting);  // Output: Bonjour
        System.out.println(farewell);  // Output: Au revoir
    }
}
