package ru.mirea.uibo1.grachova.pr12;

import java.util.Scanner;

import java.util.Scanner;

public class Task_7 {

    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter key (press Enter after input): ");
        String key = myScanner.nextLine();
        printDetails (key);
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
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }


    public static void main(String[] args) {
        Task_7 demo = new Task_7();
        try {

            demo.getKey();
        } catch (Exception e) {

            System.out.println("Caught in main: " + e.getMessage());
        }
        System.out.println("Program finished.");
    }
}