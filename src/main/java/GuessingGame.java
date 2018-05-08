import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class GuessingGame {

    public static void main(String[] args) {
        GuessingGame guessingGame = new GuessingGame();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        while (1 == 1) {
            String itemName = getItemNameFromConsole(console);
            int capacity = getCapacityFromConsole(itemName, console);

            Jar jar = new Jar(itemName, capacity);
            jar.fill();

            int countOfAttempt = 0;
            int guess = 0;
            boolean isAnswerCorrect = false;
            while (!isAnswerCorrect) {
                if (guess != jar.getItemCount()) {
                    guess = getGuessFromConsole(itemName, capacity, console);
                    countOfAttempt++;
                } else {
                    isAnswerCorrect = true;
                    System.out.printf("You got it in %s attempt(s) %n", countOfAttempt);
                }
            }
        }
    }

    public static String getItemNameFromConsole(BufferedReader console) {
        String itemName = null;
        while (itemName == null) {
            try {
                System.out.println("What type of item:");
                itemName = console.readLine();
            } catch (Exception ex) {
                itemName = null;
            }
        }

        return itemName;
    }

    public static int getCapacityFromConsole(String itemName, BufferedReader console) {
        String input = null;
        int capacity = 0;
        while (input == null) {
            try {
                System.out.printf("What is the maximum amount of %s:", itemName);
                input = console.readLine();
                capacity = Integer.parseInt(input);
            } catch (Exception ex) {
                input = null;
            }
        }
        return capacity;
    }

    public static int getGuessFromConsole(String itemName, int capacity, BufferedReader console) {
        String input = null;
        int guess = 0;
        while (input == null) {
            try {
                System.out.printf("How many %s are in the jar? Pick a number between 1 and %s:", itemName, capacity);
                input = console.readLine();
                guess = Integer.parseInt(input);
            } catch (Exception ex) {
                input = null;
            }
        }
        return guess;
    }
}
