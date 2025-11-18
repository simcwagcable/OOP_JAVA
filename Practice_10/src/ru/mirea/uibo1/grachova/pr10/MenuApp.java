package ru.mirea.uibo1.grachova.pr10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuApp extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JMenuItem saveItem, exitItem, copyItem, cutItem, pasteItem, aboutItem;

    public MenuApp() {
        super("Hello Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Используем BorderLayout для размещения компонентов
        setLayout(new BorderLayout());

        // 1. Создание Меню (JMenuBar, JMenu, JMenuItem)
        JMenuBar menuBar = new JMenuBar();

        // Меню "Файл"
        JMenu fileMenu = new JMenu("File");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Разделитель
        fileMenu.add(exitItem);

        // Меню "Правка"
        JMenu editMenu = new JMenu("Edit");
        copyItem = new JMenuItem("Copy");
        cutItem = new JMenuItem("Cut");
        pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        // Меню "Справка"
        JMenu helpMenu = new JMenu("Help");
        aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        // Добавление меню в Bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        // 2. Создание кнопок и панели для них
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // 3. Создание текстового поля
        textArea = new JTextArea("This is the area you can write text.", 5, 20);
        // Добавление прокрутки (полезное замечание на стр. 14)
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Добавление слушателей к элементам меню
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        copyItem.addActionListener(this);
        cutItem.addActionListener(this);
        pasteItem.addActionListener(this);
        aboutItem.addActionListener(this);

        // Добавление слушателей к кнопкам
        button1.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button 1 clicked!"));
        button2.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button 2 clicked!"));

        // Размещение компонентов во фрейме
        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    // Единый обработчик для всех пунктов меню
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitItem) {
            System.exit(0);
        } else if (e.getSource() == saveItem) {
            JOptionPane.showMessageDialog(this, "File saved (simulation).", "Action", JOptionPane.PLAIN_MESSAGE);
        } else if (e.getSource() == copyItem) {
            textArea.copy();
        } else if (e.getSource() == cutItem) {
            textArea.cut();
        } else if (e.getSource() == pasteItem) {
            textArea.paste();
        } else if (e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(this, "GUI Application using Swing.", "About", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new MenuApp();
    }
}