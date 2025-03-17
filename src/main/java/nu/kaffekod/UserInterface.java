package nu.kaffekod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserInterface {

    public static void welcome() {
        System.out.print(
" $$$$$$\\                                                                               $$$$$$\\                                                     $$\\                         \n" +
"$$  __$$\\                                                                             $$  __$$\\                                                    $$ |                        \n" +
"$$ /  \\__|$$\\   $$\\  $$$$$$\\   $$$$$$\\   $$$$$$\\  $$$$$$$\\   $$$$$$$\\ $$\\   $$\\       $$ /  \\__| $$$$$$\\  $$$$$$$\\ $$\\    $$\\  $$$$$$\\   $$$$$$\\ $$$$$$\\    $$$$$$\\   $$$$$$\\  \n" +
"$$ |      $$ |  $$ |$$  __$$\\ $$  __$$\\ $$  __$$\\ $$  __$$\\ $$  _____|$$ |  $$ |      $$ |      $$  __$$\\ $$  __$$\\\\$$\\  $$  |$$  __$$\\ $$  __$$\\\\_$$  _|  $$  __$$\\ $$  __$$\\ \n" +
"$$ |      $$ |  $$ |$$ |  \\__|$$ |  \\__|$$$$$$$$ |$$ |  $$ |$$ /      $$ |  $$ |      $$ |      $$ /  $$ |$$ |  $$ |\\$$\\$$  / $$$$$$$$ |$$ |  \\__| $$ |    $$$$$$$$ |$$ |  \\__|\n" +
"$$ |  $$\\ $$ |  $$ |$$ |      $$ |      $$   ____|$$ |  $$ |$$ |      $$ |  $$ |      $$ |  $$\\ $$ |  $$ |$$ |  $$ | \\$$$  /  $$   ____|$$ |       $$ |$$\\ $$   ____|$$ |      \n" +
"\\$$$$$$  |\\$$$$$$  |$$ |      $$ |      \\$$$$$$$\\ $$ |  $$ |\\$$$$$$$\\ \\$$$$$$$ |      \\$$$$$$  |\\$$$$$$  |$$ |  $$ |  \\$  /   \\$$$$$$$\\ $$ |       \\$$$$  |\\$$$$$$$\\ $$ |      \n" +
" \\______/  \\______/ \\__|      \\__|       \\_______|\\__|  \\__| \\_______| \\____$$ |       \\______/  \\______/ \\__|  \\__|   \\_/     \\_______|\\__|        \\____/  \\_______|\\__|      \n" +
"                                                                      $$\\   $$ |                                                                                               \n" +
"                                                                      \\$$$$$$  |                                                                                               \n" +
"                                                                       \\______/                                                                                                \n"
        );
    }

    public static void showMenu() {
        System.out.println("What currency do you want to convert?");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to EUR");
        System.out.println("4. Convert EUR to SEK");
        System.out.println("0. Exit");
    }

    public static void showResult(String type, double input, double result) {
        String[] currencies = getCurrencies(type);
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");

        System.out.printf("%s → %.3f %S = %.3f %S \n", currentDateTime.format(formatter), input, currencies[0], result, currencies[1]);
    }

    public static void waitingForUserInput() {
        System.out.print("✦ ");
    }

    public static void chooseMenuPlz() {
        System.out.println("Please choose a menu item");
    }

    public static void chosenMenuItem(String type) {
        String[] currencies = getCurrencies(type);
        System.out.printf("Convert %S to %S: \n", currencies[0], currencies[1]);
    }

    public static void chooseNumberPlz() {
        System.out.println("Please choose a number to convert");
    }


    private static String[] getCurrencies(String type) {
        return type.split("To");
    }
}
