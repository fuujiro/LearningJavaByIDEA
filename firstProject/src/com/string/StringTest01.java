package com.string;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String username = "fzy";
        String password = "1219";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();
            if (username.equals(name) && pwd.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登陆失败；你还有" + (2 - i) + "次机会");
                if (i == 2) {
                    break;
                }
            }
        }
    }
}
