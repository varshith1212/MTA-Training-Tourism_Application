package console;

import java.util.Random;
import java.util.Scanner;

public class friendship_calculator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name:");
        String n1 = scan.next();
        System.out.print("Enter your friend name:");
        String n2 = scan.next();
        System.out.println("Hey "+n1);
        System.out.print("Your friendship percentage is:");

        Random r = new Random();
        int v = r.nextInt(100);
        System.out.println(v);
    }
}