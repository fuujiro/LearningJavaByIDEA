package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int res = num==0?o1.getName().compareTo(o2.getName()):num;
                return res;
            }
        });

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

        for(Student s : ts) {
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
