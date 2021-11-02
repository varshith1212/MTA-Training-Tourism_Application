import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double v = 255.255;
        int v2 = (int)v;
        byte v3 = (byte)v2;
        System.out.println(v2);
        System.out.println(v3);
        System.out.println();
    }
}
