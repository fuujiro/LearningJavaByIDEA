package com.StringBuilder;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        String s = sb.toString();

        String s2 = "hello";
        StringBuilder sb2 = new StringBuilder(s2);
        System.out.println(sb2);
    }
}
