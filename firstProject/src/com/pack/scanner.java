package com.pack;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String line = sc.nextLine();
        System.out.println("结果：" + line);
    }
}
