package ru.mirea.uibo1.grachova.pr10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelector extends JFrame {
    private JComboBox<String> countryComboBox;
    private JLabel infoLabel;

    public CountrySelector() {
        super("Country Selector");
        setLayout(new FlowLayout());
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Массив стран
        String[] countries = {"Australia", "China", "England", "Russia"};
        countryComboBox = new JComboBox<>(countries);

        // Лейбл для отображения информации
        infoLabel = new JLabel("Select a country to see information.");

        // Добавление слушателя
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                displayCountryInfo(selectedCountry);
            }
        });

        // Добавление компонентов
        add(new JLabel("Select Country:"));
        add(countryComboBox);
        add(infoLabel);

        setVisible(true);
    }

    private void displayCountryInfo(String country) {
        String info;
        switch (country) {
            case "Australia":
                info = "Capital: Canberra. Official language: English.";
                break;
            case "China":
                info = "Capital: Beijing. Official language: Mandarin.";
                break;
            case "England":
                info = "Capital: London. Official language: English.";
                break;
            case "Russia":
                info = "Capital: Moscow. Official language: Russian.";
                break;
            default:
                info = "Information not available.";
        }
        infoLabel.setText(info);
        JOptionPane.showMessageDialog(this, info, country + " Info", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountrySelector());
    }
}
