import java.util.ArrayList;
import java.util.Scanner;

/**
 * Players games of R/P/S between you
 * and a robot
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class Main {
    private static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        int p1Score = 0;
        int p2Score = 0;
        int gamecount = 0;
        int gameRounds;
        boolean anotherGame = false;
        String doAgain;

        // Intro menu and it's spacing line
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println();

        // Sets the name of player 1
        players.add(new Human());
        players.get(0).setPlayerName();

        // User decides which player we're playing against
        String playerInput = Validator.getFirstChar(scnr, "Would you like to play The Wranglers or The Jets? (w/j): ",
                "w", "j");
        // Uses answer to initialize player 2
        switch (playerInput) {
            // If they choose to play the Wranglers
            case "w":
                players.add(new Machine());
                players.get(1).setPlayerName();
                break;
            // If they choose to play the Jets
            case "j":
                players.add(new Robot());
                players.get(1).setPlayerName();
                break;
        }

        do {
            // Sets amount of rounds to play before starting another game
            System.out.println("Game " + gamecount + " :");
            gameRounds = Validator.getInt(scnr, "How many rounds do you want to play in this game?: ", 0);
            System.out.println();

            for (int i = 1; i <= gameRounds; i++) {
                // Announces each round
                System.out.println("Round " + i + ":");

                // Gets the guesses of both players
                players.get(0).setPlayerGuess();
                players.get(1).setPlayerGuess();

                // Prints players picks
                System.out.println(players.get(0).getPlayerName() + ": " + players.get(0).getPlayerGuess().toString());
                System.out.println(players.get(1).getPlayerName() + ": " + players.get(1).getPlayerGuess().toString());

                // Compares player 1's and player 2's guesses and calculates a winner for each round.
                if (Roshambo.compareThese(players.get(0).getPlayerGuess(), players.get(1).getPlayerGuess())) {
                    //If player 1 beats player 2
                    System.out.println("" + players.get(0).getPlayerName() + " wins this round!");
                    p1Score++;
                } else if (Roshambo.compareThese(players.get(1).getPlayerGuess(), players.get(0).getPlayerGuess())) {
                    // If player 2 beats player 2
                    System.out.println("" + players.get(1).getPlayerName() + " wins this round!");
                    p2Score++;
                } else {
                    // If neither of them won.
                    System.out.println("Tie!");
                }
                // Extra spacing
                System.out.println();
            }

            // Announces final score for each player
            System.out.println(players.get(0).getPlayerName() + ": " + p1Score);
            System.out.println(players.get(1).getPlayerName() + ": " + p2Score);

            // Announces winner
            if (p1Score > p2Score) {
                System.out.println("" + players.get(0).getPlayerName() + " wins the game!");

            } else if (p2Score > p1Score) {
                System.out.println("" + players.get(1).getPlayerName() + " wins the game!");
            } else {
                System.out.println("This game was a tie!");
            }

            // Asks the user to enter y/n to go again
            doAgain = Validator.getFirstChar(scnr, "Would you like to play another game? (y/n): ", "y", "n");
            if (doAgain.equals("y")) {
                anotherGame = true;
            } else if (doAgain.equals("n")) {
                anotherGame = false;
            }

            // Extra spacing
            System.out.println();

            // Increases game count
            gamecount++;
        // Only repeats if user enters 'y'
        } while (anotherGame);
    }
}
