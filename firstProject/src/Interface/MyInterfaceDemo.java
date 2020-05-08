package Interface;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = new MyInterfaceImplOne();
        my.show1();
        my.show2();
        my.show3();
        //静态方法只能由接口调用
        MyInterface.show4();
    }
}
