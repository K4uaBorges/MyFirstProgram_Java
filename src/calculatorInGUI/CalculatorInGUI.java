package calculatorInGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorInGUI extends JFrame implements ActionListener {

    Operations operations;
    String nextNumber;
    String currentNumber = "0" ;
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
                nextNumber = "0";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber
                        +"\nnext= "+nextNumber);
                break;
            case "1":
                nextNumber = "1";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber
                        +"\nnext= "+nextNumber);
                    break;
            case "2":
                nextNumber = "2";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber
                        +"\nnext= "+nextNumber);
                break;
            case "3":
                nextNumber = "3";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber
                        +"\nnext= "+nextNumber);
                break;
            case "4":
                nextNumber = "4";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber
                        +"\nnext= "+nextNumber);
                break;
            case "5":
                nextNumber = "6";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber +
                        "\nnext= "+nextNumber);
                break;
            case "6":
                nextNumber = "6";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber +
                        "\nnext= "+nextNumber);
                break;
            case "7":
                nextNumber = "7";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber
                        +"\nnext= "+nextNumber);
                break;
            case "8":
                nextNumber = "8";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber
                       +"\nnext= "+nextNumber);
                break;
            case "9":
                nextNumber = "9";
                operations.verifyNumber(nextNumber);
                System.out.println("current= "+currentNumber
                       +"\nnext= "+nextNumber);
                break;
            case "%":
                operations.Operations(OPERATORS.PERCENTAGE);
            }
        }


        public static void main (){
            new CalculatorInGUI();
        }
    }

