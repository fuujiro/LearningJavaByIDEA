package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("fzy", 20);
        Student s2 = new Student("wlz", 21);
        Student s3 = new Student("lty", 22);
        Student s4 = new Student("zzm", 22);
        Student s5 = new Student("zzk", 22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s : ts) {
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
