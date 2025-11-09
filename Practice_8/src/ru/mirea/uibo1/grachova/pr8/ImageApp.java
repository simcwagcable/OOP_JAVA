package ru.mirea.uibo1.grachova.pr8;

import javax.swing.*;
import java.awt.*;

public class ImageApp {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Использование: java ImageApp <путь_к_файлу_картинки>");
            return;
        }

        final String imagePath = args[0];

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Display Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ImageIcon imageIcon = new ImageIcon(imagePath);

            if (imageIcon.getIconWidth() == -1) {
                JOptionPane.showMessageDialog(frame, "Не удалось загрузить изображение по пути:\n" + imagePath, "Ошибка", JOptionPane.ERROR_MESSAGE);
                frame.dispose();
                return;
            }

            JLabel imageLabel = new JLabel(imageIcon);

            frame.getContentPane().add(imageLabel, BorderLayout.CENTER);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}