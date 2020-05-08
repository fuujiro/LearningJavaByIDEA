package Stream;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        ArrayList<String> zhangList = new ArrayList<>();

        for (String s : list) {
            if (s.startsWith("张")) {
                zhangList.add(s);
            }
        }

        //System.out.println(zhangList);

        ArrayList<String> numList = new ArrayList<>();

        for (String s : zhangList) {
            if (s.length() == 3) {
                numList.add(s);
            }
        }

        //System.out.println(numList);

        for (String s : numList) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        //Stream流来改进
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        //解释：生成流，过滤姓张，过滤长度为3，逐一打印
        //Stream流把真正的函数式编程风格引入到Java

    }
}
