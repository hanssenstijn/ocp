package org.example.ch11;

import java.util.Locale;

public class LanguageCode {
    public static void main(String[] args) {
        Locale locale = new Locale("en");  // English
        Locale locale2 = new Locale("en", "US");  // English, United States
        Locale locale3 = new Locale("en", "US", "POSIX");  // English, United States, POSIX variant
        Locale locale4 = Locale.forLanguageTag("en-US");  // Using BCP 47 language tag

        
    }
}
