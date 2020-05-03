package com.StringBuilder;

public class StringBuilderDemo04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String res = arr2String(arr);
        System.out.println(res);
    }
    public static String arr2String(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
