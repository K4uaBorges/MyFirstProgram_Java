
//to execute

import javax.swing.*;
import java.awt.*;

class CalculatorInGUI {

    public static class FrameInicial {

        public String[] calculatorNumbers = {"0","1","2","3","4","5","6","7","8","9"};
        public String[] calculatorOperations = {".","(",")","+","-","/","*","%"};
        public String calculatorNumber1 = "";
        public String calculatorNumber2 = "";
        public JFrame F;
        public JButton BUTTON;
        public JTable TABLE;
        public int X = 2;
        public int Y = 2;
        public JPanel PANEL;
        public final static boolean RIGHT_TO_LEFT = false;
        public final static boolean shouldFill = true;

        public void addComponentInPainel(Container comp) {

            if (RIGHT_TO_LEFT) {
                comp.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            }

            comp.setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            if (shouldFill) {
                gbc.fill = GridBagConstraints.BOTH;
                gbc.weightx = X;
                gbc.weighty = Y;
            }

            BUTTON = new JButton("<-");
            gbc.gridx = 0;
            gbc.gridy = 0;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("/");
            gbc.gridx = 1;
            gbc.gridy = 0;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("%");
            gbc.gridx = 2;
            gbc.gridy = 0;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton(".");
            gbc.gridx = 3;
            gbc.gridy = 0;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("7");
            gbc.gridx = 0;
            gbc.gridy = 1;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("8");
            gbc.gridx = 1;
            gbc.gridy = 1;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("9");
            gbc.gridx = 2;
            gbc.gridy = 1;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("*");
            gbc.gridx = 3;
            gbc.gridy = 1;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("4");
            gbc.gridx = 0;
            gbc.gridy = 2;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("5");
            gbc.gridx = 1;
            gbc.gridy = 2;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("6");
            gbc.gridx = 2;
            gbc.gridy = 2;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("-");
            gbc.gridx = 3;
            gbc.gridy = 2;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("1");
            gbc.gridx = 0;
            gbc.gridy = 3;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("2");
            gbc.gridx = 1;
            gbc.gridy = 3;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("3");
            gbc.gridx = 2;
            gbc.gridy = 3;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("+");
            gbc.gridx = 3;
            gbc.gridy = 3;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("(");
            gbc.gridx = 0;
            gbc.gridy = 4;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("0");
            gbc.gridx = 1;
            gbc.gridy = 4;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton(")");
            gbc.gridx = 2;
            gbc.gridy = 4;
            comp.add(BUTTON, gbc);

            BUTTON = new JButton("=");
            gbc.gridx = 3;
            gbc.gridy = 4;
            comp.add(BUTTON, gbc);
        }

        public FrameInicial() {
            F = new JFrame("Calculator");
            BUTTON = new JButton();
            TABLE = new JTable();
            PANEL = new JPanel();

        }

        public void creationFrame() {
            F.setDefaultLookAndFeelDecorated(true);
            F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addComponentInPainel(F.getContentPane());
            F.setSize(300,450);
            F.setVisible(true);
        }
}

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameInicial().creationFrame();
            }
        });

    }
}





