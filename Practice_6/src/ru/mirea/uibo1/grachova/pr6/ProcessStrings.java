package ru.mirea.uibo1.grachova.pr6;

public class ProcessStrings implements StringWorker {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddPositionChars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String invertString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
