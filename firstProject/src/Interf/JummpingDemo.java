package Interf;

public class JummpingDemo {
    public static void main(String[] args) {
//        Jummping j = new Jummping();
        Jummping j = new Cat();
        j.jump();

        int i = Integer.parseInt("100"+"2");
        System.out.println(i);

        Integer ii = i;
        ii = ii + 100;
        System.out.println(ii);
    }
}
