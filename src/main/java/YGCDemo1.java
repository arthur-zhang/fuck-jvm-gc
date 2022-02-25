import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class YGCDemo1 {
    private static final int _1MB = 1024 * 1024;
    private static List<byte[]> dataList = new ArrayList<>();

    // java -server -Xmn400M -XX:SurvivorRatio=8 -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps
    // -XX:+UseParNewGC -XX:+UseConcMarkSweepGC  YGCDemo1
    // |320m|40m|40m|600m|
    public static void main(String[] args) throws IOException {
        // 生成4M的永久内存
        addToList(4);
        // 触发 1 次 YoungGC
        fillInYoung(320);
        // 生成12M的永久内存
        addToList(12);
        // 触发 2 次 YoungGC
        fillInYoung(320);
        // 生成12M的永久内存
        addToList(12);
        // 触发 3 次 YoungGC
        fillInYoung(320);
        // 触发 4 次 YoungGC
        fillInYoung(320);
        System.in.read();
    }
    public static void addToList(int sizeInMB) {
        for (int i = 0; i < sizeInMB; i++) {
            dataList.add(new byte[_1MB]);
        }
    }
    public static void fillInYoung(int sizeInMB) {
        for (int i = 0; i < sizeInMB; i++) {
            byte[] a = new byte[_1MB];
        }
    }
}
