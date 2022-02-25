import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created By Arthur Zhang at 2022/2/21
 */

class Bar {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize call");
        TimeUnit.DAYS.sleep(1);
        System.out.println("finalize done");
    }
}

public class FinalizerTest {


    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("in main");
        System.in.read();
        for (int i = 0; i < 10; i++) {
            new Bar();
        }
        System.out.println("after for");
        System.gc();
        System.in.read();

    }
}
