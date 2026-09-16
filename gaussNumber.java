import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(10) + 1; // Number between 1 and 10

        System.out.println("=== Number Guessing Game ===");
        System.out.print("Guess a number between 1 and 10: ");

        int guess = sc.nextInt();

        if (guess == secretNumber) {
            System.out.println("🎉 Congratulations! You guessed correctly.");
        } else {
            System.out.println("❌ Wrong guess!");
            System.out.println("The correct number was: " + secretNumber);
        }

        sc.close();
    }
}
