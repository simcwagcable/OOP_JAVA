package ru.mirea.uibo1.grachova.pr12;

public class ThrowsDemo6 {

    public void printMessage (String key) {

        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails (String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }


    public static void main(String[] args) {
        ThrowsDemo6 demo = new ThrowsDemo6();

        System.out.println("1. Correct key");
        try {
            demo.printMessage("valid_key");
        } catch (Exception e) {

            System.err.println("Unexpected error: " + e.getMessage());
        }


        System.out.println("2. Null key with try-catch");
        try {

            demo.printMessage(null);
        } catch (NullPointerException e) {

            System.err.println("Error caught: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}