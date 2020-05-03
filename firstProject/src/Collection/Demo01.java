package Collection;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        List<String> c  = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");



//        Iterator<String> iterator = c.iterator();
        ListIterator<String> iterator = c.listIterator();

        while(iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        while(iterator.hasPrevious()){
            String s = iterator.previous();
            System.out.println(s);
        }

        for(String s:c) {
            System.out.println(s);
        }

        LinkedList<Object> linkedList = new LinkedList<>();

        System.out.println(c);
    }
}
