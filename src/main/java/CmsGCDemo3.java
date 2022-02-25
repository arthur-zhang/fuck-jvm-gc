/**
 * Created By Arthur Zhang at 2022/2/23
 */
public class CmsGCDemo3 {
    private static final int _1MB = 1024 * 1024;

    // -Xmx2000m -Xms2000m -Xmn1000m
    public static void main(String[] args) throws Exception {
        System.out.println("allocate 200M");
        byte[] b1 = new byte[200 * _1MB];
//        System.in.read();

        System.out.println("allocate 200M");
        byte[] b2 = new byte[200 * _1MB];
//        System.in.read();

        System.out.println("allocate 200M");
        byte[] b3 = new byte[200 * _1MB];
//        System.in.read();

        System.out.println("allocate 400M");
        byte[] b4 = new byte[400 * _1MB];
        System.in.read();
    }
}
