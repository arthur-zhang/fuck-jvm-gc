import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By Arthur Zhang at 2022/2/24
 */
public class CmsGCDemo5 {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IOException {
        int size = 9;
        List<byte[]> list = new ArrayList<>(size);
        for (int i = 1; i <= size; i++) {
            System.out.println("allocate " + i * 100 + "M");
            list.add(new byte[100 * _1MB]);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("allocate " + i * 10 + "M");
            list.add(new byte[10 * _1MB]);
            System.in.read();
        }
    }
}
