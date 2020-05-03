package com.ArrayList;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("小米");
        arr.add("华为");
        arr.add("三星");

        //System.out.println(arr);

        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
