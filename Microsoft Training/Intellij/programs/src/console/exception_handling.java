import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        int x ;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        System.out.println("hello");
        try{
            System.out.println(x/ 0);
        }
        catch(Exception e){
            System.out.println("Division by zero not possible "+e);
        }
        System.out.println("hi");
    }
}
