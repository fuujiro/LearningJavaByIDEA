package Interface;

public interface MyInterface {
    void show1();

    void show2();

    //默认方法，不必重写
    //public可以省略，default不可被省略
    public default void show3() {
        System.out.println("方法3");
    }

    //静态方法
    public static void show4() {
        System.out.println("静态方法");
        //show();
    }

    //java9支持
//    private void show() {
//        System.out.println("233333测试");
//    }
}
