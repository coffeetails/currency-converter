package nu.kaffekod;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static nu.kaffekod.UserInterface.waitingForUserInput;

// TODO: 1. Menu Display: The application should display a menu to the user with options to convert between different currencies or exit the program.
        // TODO: 2. User Input Handling: The application should capture user input for menu choices and currency amounts.
        // TODO: 3. Currency Conversion: The application should accurately convert amounts between SEK, USD, and Euro using predefined exchange rates.
        // TODO: 4. Formatted Output: The application should display conversion results in a formatted manner along with the current date and time.
        // TODO: 5. Data Validation: The application should handle invalid inputs gracefully (e.g., non-numeric values, negative amounts).
        // TODO: 6. Code Structure: The application should be well-structured using classes and methods for clarity and maintainability.

public class Main {
    public static double sekToUsd = 0.098363222;
    public static double usdToSek = 10.166401;
    public static double sekToEuro = 0.090487126;
    public static double euroToSek = 11.051296;

    public static void main(String[] args) throws InterruptedException {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        UserInterface.welcome();
        UserInterface.showMenu();

        while(run) {
            double userInput = scanner.nextDouble();
            waitingForUserInput();


            if(userInput == 0) {
                run = false;
            } else if (userInput == 1) {
                CalculateCurrency.sekToUsd(scanner.nextDouble());
            } else if (userInput == 2) {
                CalculateCurrency.usdToSek(scanner.nextDouble());
            } else if (userInput == 3) {
                CalculateCurrency.sekToEuro(scanner.nextDouble());
            } else if (userInput == 4) {
                CalculateCurrency.euroToSek(scanner.nextDouble());
            } else {
                System.out.print("Please choose a menu item");
            }
            TimeUnit.MILLISECONDS.sleep(500);
            UserInterface.showMenu();
        };
    }

}