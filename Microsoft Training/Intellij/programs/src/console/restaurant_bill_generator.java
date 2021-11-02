package console;

import java.util.Scanner;

public class restaurant_bill_generator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scan.next();

        System.out.print("Order please:");

        System.out.println("Menu:");
        System.out.println("1.Tea\n2.Coffee\n3.Maggi\n4.cake\n5.chocolates\n6.end");

        int sum=0;
        int order = 0;

        do {
            order = scan.nextInt();

            switch (order) {
                case 1:
                    System.out.println("The cost of the Tea is 10");
                    sum += 10;
                    break;
                case 2:
                    System.out.println("The cost of the coffee is 25");
                    sum += 25;
                    break;
                case 3:
                    System.out.println("The cost of the Maggi is 30");
                    sum += 30;
                    break;
                case 4:
                    System.out.println("The cost of the cake is 100");
                    sum += 100;
                    break;
                case 5:
                    System.out.println("The cost of the chocolates is 60");
                    sum += 60;
                    break;
                default:
                    System.out.println("please order some more...!");
                    break;
            }
        }while(order<=5);
        System.out.println("hello "+name+"\nYour bill is:"+sum);
    }
}
