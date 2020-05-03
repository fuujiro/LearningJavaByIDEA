package Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.114", 10010);

        OutputStream os = s.getOutputStream();
        os.write("Hello, TCP, 我来了".getBytes());

        s.close();
    }
}
