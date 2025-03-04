import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for integer input
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt for double input
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();

        // Consume newline left after nextDouble()
        input.nextLine();

        // Prompt for string input
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Display results with formatting
        System.out.printf("Your integer: %d%n", userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);

        input.close();
    }
}
