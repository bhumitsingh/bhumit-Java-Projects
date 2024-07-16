package com.company;

import javax.swing.plaf.basic.BasicHTML;
import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
        String str = "Bhumit Dev Singh";
        int Length= str.length();
        System.out.println(Length);

        str = str.toLowerCase(Locale.ROOT);
        System.out.println(str);

        str = str.toUpperCase(Locale.ROOT);
        System.out.println(str);

        String str2= "     Bhumit     ";
        System.out.println(str2);
        String Trimmed = str2.trim();
        System.out.println(Trimmed);

        String sub = str.substring(5);
        System.out.println(sub);

        String sub2 = str.substring(11,16);
        System.out.println(sub2);

        String R_eplace = str.replace("B","S");
        System.out.println(R_eplace);

        System.out.println(str.startsWith("BHU"));

        System.out.println(str.endsWith("GH"));

        System.out.println(str.charAt(12));

        System.out.println(str.indexOf("M"));

        System.out.println(str.indexOf("H",1));
    }
}
