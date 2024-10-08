package Task1;
import java.util.*;

public class guessNumber {

	public static void main(String[] args) {
		  // Create a Scanner object to read input from the user
		  Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        String playAgain;
	        int totalScore = 0;
	        int roundsWon = 0;

	        do {
	            int numberToGuess = random.nextInt(100) + 1;
	            int userGuess = 0;
	            int attempts = 5;
	            int attemptsTaken = 0;
	            boolean guessedCorrectly = false;

	            System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");

	            // Loop for the limited number of attempts
	            for (int i = 1; i <= attempts; i++) {
	                System.out.print("Attempt " + i + ": ");
	                userGuess = scanner.nextInt();
	                attemptsTaken++;

	                // Compare the guess with the generated number
	                if (userGuess < numberToGuess) {
	                    System.out.println("Your guess is too low.");
	                } else if (userGuess > numberToGuess) {
	                    System.out.println("Your guess is too high.");
	                } else {
	                    System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
	                    guessedCorrectly = true;
	                    break; // Exit the loop when the guess is correct
	                }

	                // Inform the user about remaining attempts
	                if (i == attempts) {
	                    System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess);
	                } else {
	                    System.out.println("You have " + (attempts - i) + " attempts left.");
	                }
	            }

	            // Score Calculation based on attempts taken
	            if (guessedCorrectly) {
	                int scoreForThisRound = (attempts - attemptsTaken + 1) * 10; // Fewer attempts mean a higher score
	                totalScore += scoreForThisRound;
	                roundsWon++;
	                System.out.println("You earned " + scoreForThisRound + " points in this round.");
	            } else {
	                System.out.println("You didn't guess the number this round.");
	            }

	            System.out.println("Your total score is: " + totalScore);
	            System.out.println("Rounds won: " + roundsWon);

	            // Ask if the user wants to play another round
	            System.out.print("Would you like to play again? (yes or no): ");
	            playAgain = scanner.next();

	        } while (playAgain.equalsIgnoreCase("yes"));

	        System.out.println("Game over! Final score: " + totalScore);
	        System.out.println("Total rounds won: " + roundsWon);
	        System.out.println("Thanks for playing!");
	        scanner.close();
		
	}

}
