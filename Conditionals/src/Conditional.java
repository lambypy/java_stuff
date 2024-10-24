// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //-----TASK 1------

        System.out.println("Hello and welcome!");
        Scanner nameRequester1 = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = nameRequester1.nextInt();     //input
        Scanner nameRequester2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        int num2 = nameRequester2.nextInt();     //input

        if (num1 > num2){
            System.out.println(num1);
        } else if (num2 > num1){
            System.out.println(num2);
        } else {
            System.out.println("They are equal");
        }

        System.out.println("Please type in a traffic light colour (green, yellow, red)");
        Scanner trafficLightRequest = new Scanner(System.in);
        String trafficLight = trafficLightRequest.nextLine();
        trafficLight = trafficLight.toLowerCase();

        if (trafficLight.equals("green")){
            System.out.println("It's green - time to go!");
        } else if (trafficLight.equals("yellow")){
            System.out.println("It's yellow - get ready to stop!");
        } else if (trafficLight.equals("red")){
            System.out.println("It's red - you cannot go!");
        } else {
            System.out.println("I don't recognise this traffic light colour");
        }



        //-----TASK 2------
        /*
        Scanner numRequester1 = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = numRequester1.nextInt();
        double calculatedNum = num1 / 3.0;
        int num = (int) Math.ceil(calculatedNum);

        switch (num) {
            case 1 -> System.out.println("Spring");
            case 2 -> System.out.println("Summer");
            case 3 -> System.out.println("Autumn");
            case 4 -> System.out.println("Winter");
            default -> System.out.println("Invalid number");
        }
        */
    }
}