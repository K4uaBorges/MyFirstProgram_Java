package calculatorInGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorInGUI extends JFrame implements ActionListener {

    Operations op = new Operations();
    JButton[] B = new JButton[20];

    public CalculatorInGUI() {
        Visual();
    }
    public void Visual () {

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
                op.nextNumber = "0";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber
                        +"\nnext= "+op.nextNumber);
                break;
            case "1":
                op.nextNumber = "1";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber
                        +"\nnext= "+op.nextNumber);
                    break;
            case "2":
                op.nextNumber = "2";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber
                        +"\nnext= "+op.nextNumber);
                break;
            case "3":
                op.nextNumber = "3";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber
                        +"\nnext= "+op.nextNumber);
                break;
            case "4":
                op.nextNumber = "4";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber
                        +"\nnext= "+op.nextNumber);
                break;
            case "5":
                op.nextNumber = "6";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber +
                        "\nnext= "+op.nextNumber);
                break;
            case "6":
                op.nextNumber = "6";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber +
                        "\nnext= "+op.nextNumber);
                break;
            case "7":
                op.nextNumber = "7";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber
                        +"\nnext= "+op.nextNumber);
                break;
            case "8":
                op.nextNumber = "8";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber
                       +"\nnext= "+op.nextNumber);
                break;
            case "9":
                op.nextNumber = "9";
                op.verifyNumber(op.nextNumber);
                System.out.println("current= "+op.currentNumber
                       +"\nnext= "+op.nextNumber);
                break;
            case "%":
                op.Operations(OPERATORS.PERCENTAGE);
            }
        }


        public static void main (){
            new CalculatorInGUI();
        }
    }

