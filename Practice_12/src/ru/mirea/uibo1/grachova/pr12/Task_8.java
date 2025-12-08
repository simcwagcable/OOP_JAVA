package ru.mirea.uibo1.grachova.pr12;

import java.util.Scanner;

public class Task_8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            try {
                System.out.print("Enter key (empty to trigger error): ");
                String key = myScanner.next();
                printDetails(key);
                done = true;
            } catch (Exception e) {

                System.err.println("Error: " + e.getMessage() + ". Please try again.");

            }
        }
        myScanner.close();
    }

    public void printDetails (String key) throws Exception {
        try {
            String message = getDetails (key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails (String key) throws Exception {

        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task_8 demo = new Task_8();
        demo.getKey();
    }
}
