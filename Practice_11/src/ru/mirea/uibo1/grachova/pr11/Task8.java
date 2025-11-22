package ru.mirea.uibo1.grachova.pr11;

public class Task8 {

    public static boolean isPalindrome(String word, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        return isPalindrome(word, start + 1, end - 1);
    }

    public static void check(String word) {
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.print("radar: ");
        check("radar"); // YES

        System.out.print("level: ");
        check("level"); // YES

        System.out.print("java: ");
        check("java"); // NO

        System.out.print("a: ");
        check("a"); // YES

        System.out.print("ab: ");
        check("ab"); // NO
    }
}
