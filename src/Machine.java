import java.util.Scanner;

/**
 * Determines the behavior of a player
 * who's moves are predicted
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public final class Machine extends Player {
    private String playerName;
    private Roshambo playerGuess;

    /**
     * Default constructor
     */
    Machine() {
        playerName = "";
        playerGuess = Roshambo.ROCK;
    }

    /**
     * Sets the Machine player
     * name to "The Wranglers".
     */
    @Override
    public void setPlayerName() {

        playerName = "The Wranglers";
    }

    /**
     * Sets the Machine playerGuess to ROCK
     */
    @Override
    public void setPlayerGuess() {
        playerGuess = Roshambo.ROCK;
    }

    /**
     * Returns the Machine name
     * @return playerName "The Wranglers"
     */
    @Override
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Returns the machine guess value
     * @return returns playerGuess
     */
    @Override
    public Roshambo getPlayerGuess() {
        return playerGuess;
    }
}
