package com.string;

// 字符串拼接
public class StringTest04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String res = array2String(arr);
        System.out.println(res);
    }

    /*
    定义方法
     */
    public static String array2String(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ",";
            }
        }
        s += "]";
        return s;
    }
}
