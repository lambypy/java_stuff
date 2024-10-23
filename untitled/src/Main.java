import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1 - String Variables
        String firstName, lastName;
        firstName = "A-Dan";
        lastName = "Dan-A";

        String name = firstName + " " + lastName;

        System.out.println(name);


        // Task 3 - User Input
        System.out.println("What is your first name?");
        Scanner firstNameScanner = new Scanner(System.in);
        String firstQueriedName = firstNameScanner.nextLine();
        System.out.println("What is your last name?");
        Scanner lastNameScanner = new Scanner(System.in);
        String secondQueriedName = lastNameScanner.nextLine();

        System.out.println("Welcome " + firstQueriedName + " " + secondQueriedName);

        System.out.println("Please type your first number:");
        Scanner firstNumberScanner = new Scanner(System.in);
        int firstQueriedNumber = firstNumberScanner.nextInt();

        System.out.println("Please type your second number:");
        Scanner secondNumberScanner = new Scanner(System.in);
        int secondQueriedNumber = secondNumberScanner.nextInt();

        System.out.println("The sum of your two numbers is: " +
                Integer.toString(firstQueriedNumber + secondQueriedNumber));

    }
}