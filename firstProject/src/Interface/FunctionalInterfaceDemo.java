package Interface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        FInterface my = () -> System.out.println("函数式接口");
        my.show();
    }
}
