package com.fuujiro.demo;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand = "华为";
        p.price = 1999;
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
    }
}
