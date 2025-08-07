
//to execute

import javax.swing.*;

class CalculatorInGUI  {

    public static class FrameInicial{

        public JFrame F;

        public FrameInicial() {
             F = new JFrame("Calculator");
        }

        public void creationFrame() {
            F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            F.setSize(300, 500);
            F.setVisible(true);
        }


    }

    public static void main(String[] args) {
        FrameInicial newWindow = new FrameInicial();
        newWindow.creationFrame();
    }

}




