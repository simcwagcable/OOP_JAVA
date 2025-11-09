package ru.mirea.uibo1.grachova.pr8;
import javax.swing.*;
import java.awt.*;

public class RandomShapesApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("20 Random Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            DrawingPanel panel = new DrawingPanel();
            panel.setPreferredSize(new Dimension(400, 400));

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}