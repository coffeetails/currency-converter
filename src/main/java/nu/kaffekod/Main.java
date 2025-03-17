package nu.kaffekod;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static nu.kaffekod.UserInterface.waitingForUserInput;

        // DONE: 1. Menu Display: The application should display a menu to the user with options to convert between different currencies or exit the program.
        // DONE: 2. User Input Handling: The application should capture user input for menu choices and currency amounts.
        // DONE: 3. Currency Conversion: The application should accurately convert amounts between SEK, USD, and Euro using predefined exchange rates.
        // DONE: 4. Formatted Output: The application should display conversion results in a formatted manner along with the current date and time.
        // DONE: 5. Data Validation: The application should handle invalid inputs gracefully (e.g., non-numeric values, negative amounts).
        // TODO: 6. Code Structure: The application should be well-structured using classes and methods for clarity and maintainability.

public class Main {
    public static double sekToUsd = 0.098363222;
    public static double usdToSek = 10.166401;
    public static double sekToEuro = 0.090487126;
    public static double euroToSek = 11.051296;

    public static void main(String[] args) throws InterruptedException {
        boolean runProgram = true;
        boolean runInput = true;
        Scanner scanner = new Scanner(System.in);

        UserInterface.welcome();
        UserInterface.showMenu();

        while(runProgram) {
            double choosenMenuItem = -1;
            waitingForUserInput();
            String userInput = scanner.nextLine();
            try {
                choosenMenuItem = Double.parseDouble(userInput);
            } catch (Exception e) {
                UserInterface.chooseMenuPlz();
            }



            if(choosenMenuItem == 0) {
                runProgram = false;
            } else if (choosenMenuItem == 1) {
                UserInterface.chosenMenuItem("sekToUsd");
                CalculateCurrency.sekToUsd(checkCurrencyInput(runInput, userInput, scanner));
            } else if (choosenMenuItem == 2) {
                UserInterface.chosenMenuItem("usdToSek");
                CalculateCurrency.usdToSek(checkCurrencyInput(runInput, userInput, scanner));
            } else if (choosenMenuItem == 3) {
                UserInterface.chosenMenuItem("sekToEuro");
                CalculateCurrency.sekToEuro(checkCurrencyInput(runInput, userInput, scanner));
            } else if (choosenMenuItem == 4) {
                UserInterface.chosenMenuItem("euroToSek");
                CalculateCurrency.euroToSek(checkCurrencyInput(runInput, userInput, scanner));
            }

            TimeUnit.MILLISECONDS.sleep(500);
            UserInterface.showMenu();
        };
        scanner.close();
    }

    private static Double checkCurrencyInput(boolean runInput, String userInput, Scanner scanner) {
        double parsedInput = -1;
        while (runInput) {
            runInput = false;
            waitingForUserInput();
            userInput = scanner.nextLine();
            try {
                parsedInput = Double.parseDouble(userInput);
            } catch (Exception e) {
                UserInterface.chooseNumberPlz();
                runInput = true;
            }
        };
        return parsedInput;
    }

}