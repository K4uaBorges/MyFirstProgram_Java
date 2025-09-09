package calculatorInGUI;


import org.jetbrains.annotations.NotNull;

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

    /*
    Else you create the many array, i think in a another solution, who you just need 1 variable
    in inicial you just multiple 1* the number and you have number and, when you multiply next one
    you multiple the number saved with the number in current number

    for the some and minus you just some or minus the 0, e made the same process

    for the divide you need two variable, in one you have the variable for save the result and you have one for divide
     */
    private double op1;
    private double op2;
    private int numberOperators = 0;
    private double solution;
    private String nextNumber;
    private String currentNumber = "0";
    private Boolean verifyDivide = false;
    private Boolean verifyDuplicator = true;

    public void setNextNumber(String nextNumber){
        this.nextNumber = nextNumber;
        verifyDuplicator = false;
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
        if(!(verifyDuplicator)){
            currentNumber = "0";
        }
        verifyNumber(nextNumber);
        //test
        System.out.println("current= "+ currentNumber
                +"\nnext= "+nextNumber);
    }

    //In progress
    protected void Operations(@NotNull OPERATORS op) {
        switch(op){
            case DIVIDE:
                if(!(currentNumber.equals("0"))){
                    op1 = Double.valueOf(currentNumber);
                    numberOperators++;
                    verifyDivide = true;
                    verifyDuplicator = true;
                } else throw new ArithmeticException("You can't divide by zero");
                break;

            case MULTIPLY:
                if (verifyDivide == true){
                    divide();
                }
                if(numberOperators == 0){
                    op1 = 1;
                    op1 *= Double.valueOf(currentNumber);
                } else {
                    op1 *= Double.valueOf(currentNumber);
                }
                verifyDuplicator = true;
                numberOperators++;
                break;

            case SOME:
                if (verifyDivide == true){divide();}
                if(numberOperators == 0){
                    op1 = 0;
                    op1 += Double.valueOf(currentNumber);
                } else {
                    op1 += Double.valueOf(currentNumber);
                }
                verifyDuplicator = true;
                numberOperators++;
                break;

            case MINUS:
                if (verifyDivide == true){divide();}
                if(numberOperators == 0){
                    op1 = 0;
                    op1 -= Double.valueOf(currentNumber);
                } else {
                    op1 -= Double.valueOf(currentNumber);
                };
                verifyDuplicator = true;
                numberOperators++;
                break;

        }
    }

    private void divide(){
        op2 = Double.valueOf(currentNumber);
        op1/=op2;
        verifyDivide = false;
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
