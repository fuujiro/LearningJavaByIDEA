package com.StringBuilder;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb长度"+sb.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2"+sb2);
        System.out.println(sb2.length());
    }
}
