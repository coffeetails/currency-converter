package nu.kaffekod;

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
        waitingForUserInput();
    }

    public static void showResult(String type, double input, double result) {
        String[] currencies = type.split("To");
        System.out.printf("→ %f %S = %f %S \n", input, currencies[0], result, currencies[1]);
    }

    public static void waitingForUserInput() {
        System.out.print("✦ ");
    }

}
