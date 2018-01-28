
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        System.out.println("Guess a number:");
        int guess = reader.nextInt();
        int guesses = 1;
        while (numberDrawn != guess) {
            if (numberDrawn < guess) {
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else {
                System.out.println("The number is greater, guesses made: " + guesses);
            }
            System.out.println("Guess a number:");
            guess = reader.nextInt();
            guesses++;
        }
        System.out.println("Congratulations, your guess is correct!");
        // program your solution here. Do not touch the above lines!

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
