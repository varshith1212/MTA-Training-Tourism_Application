package console;

import javax.swing.text.PasswordView;
import java.awt.*;
import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bal = 10000, w, d;
        System.out.println("------ATM------");
        System.out.print("Enter your UserName:");
        String user_name = scan.next();
        System.out.print("Enter your password:");
        String password = scan.next();
        while (true) {
            if (user_name.equals("varshith") & password.equals("123456")) {

                while (true) {
                    System.out.println("1.Deposit\n2.WithDraw\n3.Balance");
                    System.out.print("Enter your option:");
                    int op = scan.nextInt();
                    if (op == 1) {
                        System.out.print("Enter the money to be deposited: ");
                        d = scan.nextInt();
                        bal = bal + d;
                    } else if (op == 2) {
                        System.out.println("Enter money to be withdrawn");
                        w = scan.nextInt();
                        if (bal >= w) {
                            System.out.println("Collect your money");
                            bal = bal - w;
                        } else
                            System.out.println("Insufficient money!!");
                    } else
                        System.out.println(bal);
                }
            }
            else {
                System.out.println("Enter correct details");
            }
        }
    }
}
