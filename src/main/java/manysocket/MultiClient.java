package manysocket;

import java.io.IOException;
import java.net.InetAddress;

public class MultiClient {
    static final int MAX_THREADS = 40;

    public static void main(String[] args) throws IOException,
            InterruptedException {
        InetAddress addr = InetAddress.getByName(null);
       // while (true) {
           // if (Client.threadCount() < MAX_THREADS)
                new Client(addr);
            Thread.currentThread().sleep(100);
      //  }
    }
}
