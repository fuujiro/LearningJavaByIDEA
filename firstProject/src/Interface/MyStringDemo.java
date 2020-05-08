package Interface;

public class MyStringDemo {
    public static void main(String[] args) {
        //匿名内部类
        useMyString(new MyString() {
            @Override
            public String mySubString(String s, int x, int y) {
                return s.substring(x, y);
            }
        });

        //普通lambda
        useMyString((String s, int x, int y) -> {
            return s.substring(x, y);
        });

        //简化
        useMyString((s, x, y) -> s.substring(x, y));

        //引用类的实例方法
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为其参数
        useMyString(String::substring);
    }

    private static void useMyString(MyString my) {
        String s = my.mySubString("HelloWorld", 2, 5);
        System.out.println(s);
    }
}
