import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        int sum=0,r=0;
        while(a!=0){
            r = a%10;
            sum = sum + r;
            a /=10;
        }
        System.out.println(sum);
    }
}
