import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int a = s.nextInt();
        int n = a,r,sum=0;
        while(n!=0){
            r = n%10;
            sum = sum*10 + r;
            n /= 10;
        }
        if(sum == a)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

        /*
        * reverse of a number is same
        * */
    }
}
