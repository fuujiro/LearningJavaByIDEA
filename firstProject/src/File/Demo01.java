package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        for(int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());
        }
        fos.close();
    }
}
