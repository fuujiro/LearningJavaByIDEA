package File;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        int by;
        while((by=fis.read())!=-1) {
            System.out.print((char) by);
        }

        //字节数组
        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1) {
            System.out.println(new String(bys,0,len));
        }

        fis.close();
    }
}
