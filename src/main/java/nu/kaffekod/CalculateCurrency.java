package nu.kaffekod;

import static nu.kaffekod.Main.sekToUsd;
import static nu.kaffekod.Main.usdToSek;
import static nu.kaffekod.Main.sekToEuro;
import static nu.kaffekod.Main.euroToSek;
import static nu.kaffekod.UserInterface.showResult;

public class CalculateCurrency {

    public static void sekToUsd(double value) {
        double result = value*sekToUsd;
        showResult("sekToUsd", value, result);
    }
    public static void usdToSek(double value) {
        double result = value*usdToSek;
        showResult("usdToSek", value, result);
    }
    public static void sekToEuro(double value) {
        double result = value*sekToEuro;
        showResult("sekToEuro", value, result);
    }
    public static void euroToSek(double value) {
        double result = value*euroToSek;
        showResult("euroToSek", value, result);
    }
}
