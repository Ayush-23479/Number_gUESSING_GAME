import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int lowerBound = 1;
    int upperBound = 100;
    int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

    int maxAttempts = 10;
    int attempts = 0;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I've selected a random number between " + lowerBound + " and " + upperBound + ".");
    System.out.println("You have " + maxAttempts + " attempts to guess the number.");

    while (attempts < maxAttempts) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        scanner.nextLine();

        attempts++;

        if (userGuess == targetNumber) {
            System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + attempts + " attempts.");
            break;
        } else if (userGuess < targetNumber) {
            System.out.println("Your guess is too low. Try again.");
        } else {
            System.out.println("Your guess is too high. Try again.");
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
        }
    }
}
}
