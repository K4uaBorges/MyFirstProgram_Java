package calculatorInGUI;


import java.util.Scanner;

enum OPERATORS{
    DIVIDE,
    MULTIPLY,
    SOME,
    MINUS,
    SOLUTION,
    PERCENTAGE
}

public class Operations {

    private double operator[];
    private double solution;
    private String nextNumber;
    private String currentNumber = "0" ;
    int i = 0;

    public void setNextNumber(String nextNumber){
        this.nextNumber = nextNumber;
    }

    public String getNextNumber(){
        return nextNumber;
    }

    public void setCurrentNumber(){
        verifyNumber(this.nextNumber);
    }

    public String getCurrentNumber(){
        return currentNumber;
    }

    public void outputNumber(){
        verifyNumber(nextNumber);
        //test
        System.out.println("current= "+ currentNumber
                +"\nnext= "+nextNumber);
    }

    //In progress
    protected void Operations(OPERATORS op) {
        switch(op){
            case DIVIDE:
                verifyNumber(nextNumber);
                if(!(currentNumber.equals("0"))){
                    operator[i] = Double.valueOf(currentNumber);
                    i++;
                    currentNumber = "0";
                } else throw new ArithmeticException("You can't divide by zero");
                break;

            case MULTIPLY:
                verifyNumber(nextNumber);
                operator[i] = Double.valueOf(currentNumber);
                i++;
                currentNumber = "0";
                break;

            case SOME:
                verifyNumber(nextNumber);
                operator[i] = Double.valueOf(currentNumber);
                i++;
                currentNumber = "0";
                break;

            case MINUS:
                verifyNumber(nextNumber);
                operator[i] = Double.valueOf(currentNumber);
                i++;
                currentNumber = "0";
                break;

        }
    }

    protected void verifyNumber(String nextNumber) {
        if(currentNumber.equals("0")){
            currentNumber = nextNumber;
        } else if(nextNumber != null && currentNumber.length() < 9) {
            currentNumber = currentNumber+nextNumber;
        } else {
            System.out.println("Não é possivel adicionar mais");
        }
    }

}
