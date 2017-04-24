import java.util.Scanner;

/**
 * A validator class that validates various inputs
 *
 * @author Antonella Solomon
 * @version 1.0
 */
class Validator {
    /**
     * Validates a single word as being a string
     *
     * @param sc Scanner object
     * @param prompt text to prompt for input
     * @return the word the user types in
     */
    /*public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }*/

    private static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    /*public static int getInt(Scanner sc, String prompt,
                             int min, int max) {
        int i = 0;
        boolean isValid = false;

        while (!isValid)
        {
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be " + min + " or greater.");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be " + max + " or less. Try again.");
            } else {
                isValid = true;
            }
        }
        return i;
    }*/

    public static int getInt(Scanner sc, String prompt,
                             int min) {
        int i = 0;
        boolean isValid = false;

        while(!isValid) {
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println("Error! Number must be higher than " + min + ". Try again.");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    /*static double getDouble(Scanner sc, String prompt)
    {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }*/

    /*public static double getDouble(Scanner sc, String prompt,
                                   double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            d = getDouble(sc, prompt);
            if (d < min) {
                System.out.println(
                        "Error! Number must be " + min + " or greater.");
            } else if (d > max) {
                System.out.println(
                        "Error! Number must be " + max + " or less.");
            } else {
                isValid = true;
            }
        }
        return d;
    }*/

    static String getFirstChar(Scanner sc, String prompt, String char1, String char2) {
        String character = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            // if the first character of the user's next input is equal to char1
            character = Character.toString(sc.nextLine().charAt(0)).toLowerCase();
            if (character.equals(char1) || character.equals(char2)) {
                isValid = true;
            } else {
                System.out.println("Error! Invalid response. Try again.");
            }
        }
        return character;
    }

    static String getFirstChar(Scanner sc, String prompt, String char1, String char2, String char3) {
        String character = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            // if the first character of the user's next input is equal to char1
            character = Character.toString(sc.nextLine().charAt(0)).toLowerCase();
            if (character.equals(char1) || character.equals(char2) || character.equals(char3)) {
                isValid = true;
            } else {
                System.out.println("Error! Invalid response. Try again.");
            }
        }
        return character;
    }
}
