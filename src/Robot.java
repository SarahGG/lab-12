import java.util.Random;

/**
 * Determines the behavior of robot players
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public final class Robot extends Player {
    private String playerName;
    private Roshambo playerGuess;


    Robot() {
        playerName = "";
    }

    @Override
    public void setPlayerName() {
        playerName = "The Jets";
    }

    @Override
    public void setPlayerGuess() {
        Random robotDice = new Random();
        int robotRoll = robotDice.nextInt(2);

        System.out.println(robotRoll);
        switch (robotRoll) {
            case 0:
                playerGuess = Roshambo.ROCK;
                break;
            case 1:
                playerGuess = Roshambo.PAPER;
                break;
            case 2:
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
