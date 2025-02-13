package com.npru.se;

import java.text.NumberFormat;
import java.util.Locale;

public class Npru {
    public Npru (){
        // String s = "20";
        // Integer n = Integer.valueOf(s);

        // System.out.println(n+5);

        Locale locale = Locale.of("en", "US");
        int n = 20;
        System.out.println(NumberFormat.getCurrencyInstance(locale).format(n));     
        
    }
    
    public static void main(String[] args) {
        new Npru();
    }
}
