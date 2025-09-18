package ru.mirea.uibo1.grachova.pr1;

public class Task_3 {public static void main(String[] args){
    if (args.length == 0) {
        System.out.println("Аргументы не найдены.");
    } else {
        System.out.println("Предоставлены следующие аргументы:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент [" + i + "]: " + args[i]);
        }
    }
}
}