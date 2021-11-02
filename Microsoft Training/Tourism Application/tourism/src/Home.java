import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Home {

    static void customized_package(){
        int person_cost_day = 1000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your source:");
        String source = input.nextLine();
        System.out.println("Enter your destination:");
        String destination = input.nextLine();
        System.out.println("Enter your date of journey:");
        String date = input.nextLine();
        System.out.println("Enter your no.of journey days:");
        int journey_days = input.nextInt();
        System.out.println("Select your mode of transportation:");
        System.out.println("1.Airways\n2.Railways\n3.Onroad");
        int transport_mode = input.nextInt();
        int min,max;
        int ticket_cost_per_person = 0;
        switch (transport_mode){
            case 1: min = 3000;
                    max = 8000;
                    ticket_cost_per_person = ThreadLocalRandom.current().nextInt(min, max + 1);
                    break;
            case 2: min = 1000;
                    max = 3000;
                    ticket_cost_per_person = ThreadLocalRandom.current().nextInt(min, max + 1);
                    break;
            case 3: min = 5000;
                    max = 10000;
                    ticket_cost_per_person = ThreadLocalRandom.current().nextInt(min, max + 1);
                    break;
            default: System.out.println("please select a mode of transportation!!");
                    exit(0);
        }
        System.out.println("Enter no.of people:");
        int persons = input.nextInt();
        int people_cost = (persons * person_cost_day) + (persons * ticket_cost_per_person);
        System.out.println("Enter details of travellers");
        String names[] = new String[persons];
        int age[] = new int[persons];
        for(int i = 0; i<persons;i++){
            System.out.print("Name:");
            names[i] = input.nextLine();
            System.out.println("Age:");
            age[i] = input.nextInt();
        }
        System.out.println("Your journey details are:");
        System.out.println("source:"+source+"\t========>\tdestination:"+destination);
        System.out.println("Date of Journey:"+date);
        System.out.println("Passenger details:");
        System.out.println("Name\tAge");
        for(int i = 0; i<persons;i++){
            System.out.println(names[i]+"\t"+age[i]);
        }
        System.out.println("Transportation details:");
        if(transport_mode == 1){
            System.out.println("Your flight details are:");
            System.out.println("Flight no:3EJ423\tBoarding time:7.00\n");
            System.out.print("Seat no's:");
            for(int j = 0;j<persons;j++){
                System.out.print(10+j);
            }
            System.out.println("Details\t\tPer person\tcost");
            System.out.println("Your ticket price is:\t\t"+ticket_cost_per_person+"\t"+ticket_cost_per_person * persons);
            System.out.println("Stay Prices\t\t"+person_cost_day+"\t"+person_cost_day * persons);
            System.out.println("Your stay cost includes room,food(3 times a day)");
        }
        else if(transport_mode == 2){}
        System.out.println("Hurray!!!!!!Your Journey is confirmed!");
        
    }

    static void fixed_packages(){
        System.out.println("Our Travel packages are:");
        System.out.println("1.Goa Package\n2.Araku Package\n3.Gokarna Package\n4.kanyakumari Package");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----Welcome to Garuda Tourism Agency----");
        System.out.println("Please Enter your name:");
        String login_name = input.nextLine();
        System.out.println("enter your number:");
        int mobile = input.nextInt();
        System.out.println("Enter your email:");
        String email = input.nextLine();
        System.out.println("Choose your options:");
        System.out.println("1.Fixed packages\t2.Customized packages");
        int option = input.nextInt();
        switch (option){
            case 1:fixed_packages();
                   break;
            case 2:customized_package();
                   break;
        }

    }

}
