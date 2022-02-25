import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * Created By Arthur Zhang at 2022/2/21
 */
public class YGCDemo2 {
    static class Foo {
        private int i;
        @Override
        protected void finalize() throws Throwable {
            i++;
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new Thread(() -> {
            while (true) {
                fill(4);
                try {
                    TimeUnit.MILLISECONDS.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Runnable r = () -> {
            while (true) {
                try {
                    new Foo();
                    Socket socket = new Socket("127.0.0.1", 8080);
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (Exception e) {
                }
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(r).start();
        }
        System.in.read();
    }

    public static void fill(int sizeInMB) {
        for (int i = 0; i < sizeInMB / 4; i++) {
            byte[] a = new byte[4 * 1024 * 1024];
        }
    }
}
