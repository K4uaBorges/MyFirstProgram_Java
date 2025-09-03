package calculatorInGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorInGUI extends JFrame implements ActionListener {

    Operations op = new Operations();
    JButton[] B = new JButton[20];
    String nextNumber = op.getNextNumber();

    private CalculatorInGUI() {
        Visual();
    }
    private void Visual () {

        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 450);
        setLayout(new GridLayout(5, 4));
        setResizable(false);
        for (int i = 0; i < 20; i++) {
            B[0] = new JButton("/");
            B[1] = new JButton(".");
            B[2] = new JButton("%");
            B[3] = new JButton("<-");
            B[4] = new JButton("1");
            B[5] = new JButton("2");
            B[6] = new JButton("3");
            B[7] = new JButton("*");
            B[8] = new JButton("4");
            B[9] = new JButton("5");
            B[10] = new JButton("6");
            B[11] = new JButton("-");
            B[12] = new JButton("7");
            B[13] = new JButton("8");
            B[14] = new JButton("9");
            B[15] = new JButton("+");
            B[16] = new JButton("(");
            B[17] = new JButton("0");
            B[18] = new JButton(")");
            B[19] = new JButton("=");

            B[i].setFont(new Font("Arial", Font.BOLD, 20));
            B[i].addActionListener(this);
            B[i].setFocusable(false);
            add(B[i]);
        }
        setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e){
        JButton clicked = (JButton) e.getSource();
        switch (clicked.getText()) {
            case "0":
                op.setNextNumber("0");
                op.outputNumber();
                break;

            case "1":
                op.setNextNumber("1");
                op.outputNumber();
                break;
            case "2":
                op.setNextNumber("2");
                op.outputNumber();
                break;

            case "3":
                op.setNextNumber("3");;
                op.outputNumber();
                break;

            case "4":
                op.setNextNumber("4");
                op.outputNumber();
                break;

            case "5":
                op.setNextNumber("5");
                op.outputNumber();
                break;

            case "6":
                op.setNextNumber("6");
                op.outputNumber();
                break;

            case "7":
                op.setNextNumber("7");
                op.outputNumber();
                break;

            case "8":
                op.setNextNumber("8");;
                op.outputNumber();
                break;

            case "9":
                op.setNextNumber("9");
                op.outputNumber();
                break;

            case "%":
                op.Operations(OPERATORS.PERCENTAGE);
            }
        }

    private void outputOperators(){

    }

    public static void main (){
            new CalculatorInGUI();
        }
    }

