package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("fzy", 20);
        Student s2 = new Student("wlz", 21);
        Student s3 = new Student("lty", 22);
        Student s4 = new Student("lty", 22);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

//        Iterator<Student> iterator = hs.iterator();

        for (Student s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
