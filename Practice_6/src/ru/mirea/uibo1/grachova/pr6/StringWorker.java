package ru.mirea.uibo1.grachova.pr6;

public interface StringWorker {
    // а) функции подсчета символов в строке
    int countCharacters(String s);

    // б) функция возвращает строку, состоящую из символов на нечетных позициях
    String getOddPositionChars(String s);

    // в) функцию инвертирования строки
    String invertString(String s);
}
