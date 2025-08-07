
//to execute

import javax.swing.*;


public class CalculatorInGUI{

    public static JFrame F;

    private void Frame() {
         F = new JFrame("Calculator");
    }

    public void CreationFrame() {
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setSize(300, 500);
        F.setVisible(true);

    }


    public static void main(String[] args) {

        new CalculatorInGUI().Frame();
        new CalculatorInGUI().CreationFrame();

    }



}



