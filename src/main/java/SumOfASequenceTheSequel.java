
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        int result = 0;

        // for (*introducing a variable*; *condition*; *increasing the counter*) {
        // Functionality to be executed
        // }
        for (int i = firstNumber; i <= lastNumber; i++) {
            result = result + i;
        }

        System.out.print("The sum is " + result);
    }
}
