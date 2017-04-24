/**
 * Abstract player class
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public abstract class Player {

    /**
     * Inheritable set method for a player name
     */
    public abstract void setPlayerName();

    /**
     * Inheritable set method for a player guess
     */
    public abstract void setPlayerGuess();

    /**
     * Inheritable get method for player name
     * @return usually playerName
     */
    public abstract String getPlayerName();

    /**
     * Inheritable get method for player guess
     * @return usually playerGuess
     */
    public abstract Roshambo getPlayerGuess();


}
