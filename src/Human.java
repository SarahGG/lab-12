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

    Human() {
        scnr = new Scanner(System.in);
        playerName = "";
    }

    @Override
    public void setPlayerName() {
        System.out.print("Please enter your name: ");
        playerName = scnr.nextLine();
    }

    @Override
    public void setPlayerGuess() {
        String playerInput = Validator.getFirstChar(scnr, "Rock, Paper, or Scissors? (r/p/s): ", "r", "p", "s");
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

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public Roshambo getPlayerGuess() {
        return playerGuess;
    }
}
