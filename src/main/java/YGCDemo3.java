import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created By Arthur Zhang at 2022/2/22
 */
public class YGCDemo3 {

    public static void main(String[] args) throws IOException, InterruptedException {

        int size = 500 * 10000;
        List<String> namespaceList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            namespaceList.add("f");
        }
        while (true) {
            fill(1600);
            System.in.read();
        }
    }

    public static void fill(int sizeInMB) {
        for (int i = 0; i < sizeInMB / 4; i++) {
            byte[] a = new byte[4 * 1024 * 1024];
        }
    }
}
