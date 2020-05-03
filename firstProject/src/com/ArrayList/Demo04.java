package com.ArrayList;

import java.util.ArrayList;

public class Demo04 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        Student s1 = new Student("fzy", 22);
        Student s2 = new Student("wlz", 23);
        Student s3 = new Student("lty", 24);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        for(int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
