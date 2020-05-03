package com.string;

import java.util.Scanner;

//字符串翻转
public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String line = sc.nextLine();
        String res = reverseString(line);
        System.out.println(res);
    }

    public static String reverseString(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
