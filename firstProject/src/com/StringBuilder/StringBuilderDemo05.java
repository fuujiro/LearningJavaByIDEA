package com.StringBuilder;

import java.util.Scanner;

public class StringBuilderDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        String res = reverseString(s);
        System.out.println(res);
    }

    public static String reverseString(String s) {
        /*StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();*/
        return new StringBuilder(s).reverse().toString();
    }
}