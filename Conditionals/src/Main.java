// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Scanner nameRequester1 = new Scanner(System.in);

        System.out.print("Enter number 1: ");

        int num1 = nameRequester1.nextInt();     //String input

        Scanner nameRequester2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");

        int num2 = nameRequester2.nextInt();     //String input

        System.out.printf("%d", Math.max(num1, num2));

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}