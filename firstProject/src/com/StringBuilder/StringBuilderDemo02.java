package com.StringBuilder;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("hello");
        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println(sb == sb2);

        sb.reverse();
        System.out.println("sb:" + sb);
    }
}
