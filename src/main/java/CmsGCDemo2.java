import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created By Arthur Zhang at 2022/2/22
 */
public class CmsGCDemo2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < 10; i++) {
            fillInOld(100);
            fill(100);
            TimeUnit.MILLISECONDS.sleep(500);
        }
        System.in.read();
    }

    public static void fill(int sizeInMB) {
        for (int i = 0; i < sizeInMB / 4; i++) {
            byte[] a = new byte[4 * 1024 * 1024];
        }
    }

    private static List<byte[]> longLifeList = new LinkedList<>();

    public static void fillInOld(int sizeInMB) {
        for (int i = 0; i < sizeInMB / 4; i++) {
            byte[] a = new byte[4 * 1024 * 1024];
            longLifeList.add(a);
        }
    }
}
