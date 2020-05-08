package Lambda;

public class AddableDemo {
    public static void main(String[] args) {
        //匿名内部类
//        useAddable(new Addable() {
//            @Override
//            public int add(int x, int y) {
//                return x + y;
//            }
//        });

        //lambda
//        useAddable((int x, int y) -> {
//            return x + y;
//        });
        //注意：lambda必须要有接口，且接口中有且仅有一个抽象方法
        //参数类型可以省略(但多个参数下，不能只省略一个)
        useAddable((x, y) -> {
            return x + y;
        });
        
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
