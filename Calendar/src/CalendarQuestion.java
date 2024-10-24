package Calendar.src;

import java.util.Scanner;

public class CalendarQuestion {
    public static void main(String[] args) {
        System.out.println("Please type your first number:");
        Scanner firstNumberScanner = new Scanner(System.in);
        int firstQueriedNumber = firstNumberScanner.nextInt();

        System.out.println("Please type your second number:");
        Scanner secondNumberScanner = new Scanner(System.in);
        int secondQueriedNumber = secondNumberScanner.nextInt();

        System.out.println("Please type an operator (+, -, *, /)");
        Scanner operatorScanner = new Scanner(System.in);
        String operatorName = operatorScanner.nextLine();


        switch (operatorName) {
            case "+" -> System.out.println(firstQueriedNumber + secondQueriedNumber);
            case "-" -> System.out.println(firstQueriedNumber - secondQueriedNumber);
            case "*" -> System.out.println(firstQueriedNumber * secondQueriedNumber);
            case "/" -> System.out.println(firstQueriedNumber / secondQueriedNumber);
            default -> System.out.println("Invalid operator");
        }
    }
}
