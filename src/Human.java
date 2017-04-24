import java.util.Scanner;

/**
 * Determines the behavior for a human player
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public final class Human extends Player {
    private Scanner scnr;
    private String playerName;
    private Roshambo playerGuess;

    /**
     * Default constructor
     */
    Human() {
        scnr = new Scanner(System.in);
        playerName = "";
    }

    /**
     * Sets the human players name
     */
    @Override
    public void setPlayerName() {
        System.out.print("Please enter your name: ");
        playerName = scnr.nextLine();
    }

    /**
     * Sets the players guess using a Random class
     */
    @Override
    public void setPlayerGuess() {
        // Validates the user input is R, P, or S
        String playerInput = Validator.getFirstChar(scnr, "Rock, Paper, or Scissors? (r/p/s): ", "r", "p", "s");

        // Sets the Roshambo guess based on user input
        switch (playerInput) {
            case "r":
                playerGuess = Roshambo.ROCK;
                break;
            case "p":
                playerGuess = Roshambo.PAPER;
                break;
            case "s":
                playerGuess = Roshambo.SCISSORS;
                break;
        }
    }

    /**
     * Returns the player's name
     * @return playerName
     */
    @Override
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Returns the player's guess
     * @return playerGuess
     */
    @Override
    public Roshambo getPlayerGuess() {
        return playerGuess;
    }
}
