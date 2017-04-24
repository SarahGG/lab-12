/**
 * Guess enumerator for getting rolls.
 */
public enum Roshambo {

    ROCK("Rock","Scissors"), PAPER("Paper","Rock"), SCISSORS ("Scissors","Paper");

    private String thisGuess;
    private String beatsThisGuess;

    Roshambo(String isThis, String beatsThis) {
        thisGuess = isThis;
        beatsThisGuess = beatsThis;
    }

    public static boolean compareThese(Roshambo firstGuess, Roshambo secondGuess) {
        boolean firstWins = false;
        String guess1beats = firstGuess.getBeats();
        String guess2 = secondGuess.getThis();

        if (guess1beats.equals(guess2)) {
            firstWins = true;
        }
        return firstWins;
    }

    public String getThis() {
        return thisGuess;
    }

    public String getBeats() {
        return beatsThisGuess;
    }

    @Override
    public String toString() {
        return thisGuess;
    }
}
