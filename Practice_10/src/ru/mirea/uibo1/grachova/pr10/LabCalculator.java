package ru.mirea.uibo1.grachova.pr10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabCalculator extends JFrame {
    // Текстовые поля для ввода чисел
    private JTextField jta1 = new JTextField(10);
    private JTextField jta2 = new JTextField(10);

    // Кнопки для операций
    private JButton addButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton mulButton = new JButton("*");
    private JButton divButton = new JButton("/");

    public LabCalculator() {
        super("Simple Calculator");
        setLayout(new FlowLayout());
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Добавление компонентов
        add(new JLabel("1st Number:"));
        add(jta1);
        add(new JLabel("2nd Number:"));
        add(jta2);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        // Добавление слушателей к кнопкам (используем анонимные классы)
        addButton.addActionListener(new OperationListener('+'));
        subButton.addActionListener(new OperationListener('-'));
        mulButton.addActionListener(new OperationListener('*'));
        divButton.addActionListener(new OperationListener('/'));

        setVisible(true);
    }

    // Внутренний класс для обработки событий (ActionListener)
    private class OperationListener implements ActionListener {
        private char operation;

        public OperationListener(char op) {
            this.operation = op;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                // Получение и преобразование ввода
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                double result = 0;

                // Выполнение операции
                switch (operation) {
                    case '+':
                        result = x1 + x2;
                        break;
                    case '-':
                        result = x1 - x2;
                        break;
                    case '*':
                        result = x1 * x2;
                        break;
                    case '/':
                        if (x2 == 0) {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        result = x1 / x2;
                        break;
                }

                // Вывод результата
                JOptionPane.showMessageDialog(null, "Result = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                // Обработка ошибки, если введены не числа (как в Листинге 15.8)
                JOptionPane.showMessageDialog(null, "Error in Numbers! Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new LabCalculator();
    }
}
