/**
 * Guess enumerator for getting rolls.
 */
public enum Roshambo {

    ROCK("Rock","Scissors"), PAPER("Paper","Rock"), SCISSORS ("Scissors","Paper");

    private String thisGuess;
    private String beatsThisGuess;

    /**
     * Default constructor for Rochambo
     * @param isThis Title case representation of this enumeration
     * @param beatsThis The title case representation of what this guess beats
     */
    Roshambo(String isThis, String beatsThis) {
        thisGuess = isThis;
        beatsThisGuess = beatsThis;
    }

    /**
     * compares two guesses and computes a winner
     * @param firstGuess potentially winning guess
     * @param secondGuess guess to compare it to
     * @return returns true if firstGuess wins
     */
    public static boolean compareThese(Roshambo firstGuess, Roshambo secondGuess) {
        boolean firstWins = false;
        String guess1beats = firstGuess.getBeats();
        String guess2 = secondGuess.toString();

        if (guess1beats.equals(guess2)) {
            firstWins = true;
        }
        return firstWins;
    }

    /**
     * method for retrieving which roshambo result the 'current' guess beats
     * @return value that the current value 'beats'
     */
    public String getBeats() {
        return beatsThisGuess;
    }

    /**
     * returns the Titlecase version of a Roshambo guess
     * @return this players guess, in Titlecase form
     */
    @Override
    public String toString() {
        return thisGuess;
    }
}
