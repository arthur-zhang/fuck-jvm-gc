import java.io.IOException;

/**
 * Created By Arthur Zhang at 2022/2/24
 */
public class CmsGCDemo4 {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IOException {
        System.out.println("allocate 100M");
        byte[] a1 = new byte[100 * _1MB];
//        System.in.read();
        System.out.println("allocate 200M");
        byte[] a2 = new byte[100 * _1MB];
//        System.in.read();
        System.out.println("allocate 300M");
        byte[] a3 = new byte[100 * _1MB];
//        System.in.read();
        System.out.println("allocate 400M");
        byte[] a4 = new byte[100 * _1MB];
//        System.in.read();
        System.out.println("allocate 500M");
        byte[] a5 = new byte[100 * _1MB];
        System.in.read();
    }
}
