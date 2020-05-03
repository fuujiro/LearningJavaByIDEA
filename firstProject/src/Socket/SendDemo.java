package Socket;

// UDP

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "Hello, UDP, 我来了".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("192.168.1.114");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);

        ds.send(dp);

        ds.close();

    }
}
