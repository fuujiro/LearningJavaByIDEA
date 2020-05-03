package com.student;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("fzy");
        s1.setAge(30);
        s1.show();

        Student s2 = new Student("fuujiro", 22);
        s2.show();
    }
}
