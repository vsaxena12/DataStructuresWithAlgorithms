package com.dev.c.algorithms.recursion.gfg;

public class ReverseString {

    public static void main(String[] args){
        String s = "Hello World!";

        System.out.println(reverseString(s));
    }

    private static String reverseString(String str) {
        if ((str==null)||(str.length() <= 1)) {
            //System.out.print(str);
            return str;
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            String s = str.substring(0, str.length()-1);
            return reverseString(s);
        }
    }
}
