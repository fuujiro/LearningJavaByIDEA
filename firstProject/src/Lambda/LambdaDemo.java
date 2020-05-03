package Lambda;
/*
    启动一个线程，在控制台输出一句话：多线程启动了
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //实现类的方式实现需求（麻烦）
//        MyRunnable my = new MyRunnable();
//        Thread t = new Thread(my);
//        t.start();

        //匿名内部类
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程启动了");
//            }
//        }).start();

        //lambda
        new Thread( () -> {
            System.out.println("多线程启动了");
        }).start();
    }
}
