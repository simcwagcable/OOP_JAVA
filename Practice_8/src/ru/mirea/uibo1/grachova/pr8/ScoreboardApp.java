package ru.mirea.uibo1.grachova.pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreboardApp extends JFrame implements ActionListener {

    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel; // Result: 0 X 0
    private JLabel lastScorerLabel; // Last Scorer: N/A
    private JLabel winnerLabel; // Winner: DRAW
    private JButton milanButton;
    private JButton madridButton;

    private static final String MILAN = "AC Milan";
    private static final String MADRID = "Real Madrid";
    private static final String DRAW = "DRAW";

    public ScoreboardApp() {

        super("Football Scoreboard");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));


        milanButton = new JButton(MILAN);
        madridButton = new JButton(MADRID);

        milanButton.addActionListener(this);
        madridButton.addActionListener(this);

        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);


        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(3, 1));


        resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);


        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));

        labelPanel.add(resultLabel);
        labelPanel.add(lastScorerLabel);
        labelPanel.add(winnerLabel);

        this.add(buttonPanel, BorderLayout.NORTH);
        this.add(labelPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String scorer = "";


        if (e.getSource() == milanButton) {
            milanScore++;
            scorer = MILAN;
        } else if (e.getSource() == madridButton) {
            madridScore++;
            scorer = MADRID;
        }

        updateScore(scorer);
    }

    private void updateScore(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        String winner;
        if (milanScore > madridScore) {
            winner = MILAN;
        } else if (madridScore > milanScore) {
            winner = MADRID;
        } else {
            winner = DRAW;
        }
        winnerLabel.setText("Winner: " + winner);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScoreboardApp());
    }
}