package utils;
public class Rounder {


    public static String roundUp(double value) {
        String format;
        format = String.format("%.2f", value);
        return format;
    }
}
