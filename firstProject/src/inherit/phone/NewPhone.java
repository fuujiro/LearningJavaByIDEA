package inherit.phone;

public class NewPhone extends Phone{

    @Override
    public void call(String name) {
        System.out.println("视频通话");
        super.call(name);
    }
}
