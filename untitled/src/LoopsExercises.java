package untitled.src;


public class LoopsExercises {
    public static void main(String[] args) {
        System.out.println("hello");
        //firstTaskSecondExercise();
        //secondTaskSecondExercise();
        thirdTaskSecondExercise();
    }


    public static void firstTaskSecondExercise(){
        /* Removed semi-colon and added a println for clarity*/
        int x = 10;
        while (x > 0) {
            System.out.print(x--);
            System.out.println();
        }
        System.out.println("We have lift off!");
    }


    public static void secondTaskSecondExercise(){
        /* Decrement x to eradicate infinite loop*/
        int x = 10;
        while (x > 0) {
            System.out.println("x is " + x--);
        }
    }


    public static void thirdTaskSecondExercise(){
        /* initialized i and fixed indentation formatting*/
        int sum = 0;
        for (int i=0; i < 10; sum += i++) {
            System.out.println("Sum is " + sum);
        }
    }
}

