// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //-----TASK 1------
        //
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        /*
        System.out.println("Hello and welcome!");
        Scanner nameRequester1 = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = nameRequester1.nextInt();     //input
        Scanner nameRequester2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        int num2 = nameRequester2.nextInt();     //input

        System.out.printf("%d", Math.max(num1, num2));  //Compares the values
        */
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        //-----TASK 2------
        //
        Scanner numRequester1 = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = numRequester1.nextInt();
        double calculatedNum = num1 / 3.0;
        int num = (int) Math.ceil(calculatedNum);

        switch (num) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}