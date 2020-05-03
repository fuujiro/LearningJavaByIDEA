package inherit.phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.call("fzy");

        NewPhone p2 = new NewPhone();
        p2.call("fuujiro");
    }
}
