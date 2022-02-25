import java.io.IOException;
import java.util.UUID;

/**
 * Created By Arthur Zhang at 2022/2/23
 */
public class YGCDemo4 {
    public static void main(String args[]) throws IOException {
        System.out.println("in main.......");
        for (int i = 0; i < 10000000; i++) {
            uuid();
        }
        System.in.read();
    }

    public static void uuid() {
        UUID.randomUUID().toString().intern();
    }
}
