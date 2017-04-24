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

    Machine() {
        playerName = "";
    }

    @Override
    public void setPlayerName() {

        playerName = "The Wranglers";
    }

    @Override
    public void setPlayerGuess() {
        playerGuess = Roshambo.ROCK;
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
