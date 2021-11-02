import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        /*
        if(a>b & a>c){
            System.out.println(a+" is largest");
        }
        else if(b>c & b>a)
            System.out.println(b+" is largest");
        else
            System.out.println(c+" is largest");

        */


        int ans = (a>b) ? ( (a>c) ? a : c ) : ( (b>c) ? b : c);
        System.out.println(ans);
    }
}
