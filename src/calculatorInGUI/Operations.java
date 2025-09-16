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
    Else you create the many array, i think in another solution, who you need 1 variable

    In multiple, you just multiple for 1 and you have number multiple for 1 saved, ready for the next operation

    In some or minus, you just some or minus the 0, and same process

    for the divide you need two variable, in one you have the variable for save the result and, next one you have one for divide

    what happened when you clicked in equal? So think in this i implemented the duplicator, when is happen.
         */
    private double op1;
    private double op2;
    private double result;
    private int numberOperators = 0;
    private String nextNumber;
    private String currentNumber = "0";
    private Boolean verifyDivide = false;
    private Boolean verifyDoble = false;
    private Boolean verifyMultiply = false;
    private Boolean verifySome = false;
    private Boolean verifyMinus = false;

    public void setNextNumber(String nextNumber){
        this.nextNumber = nextNumber;
        outputNumber();
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
        setCurrentNumber();
        verifyDoble = false;
        //test
        System.out.println("current= "+ currentNumber
                +"\nnext= "+nextNumber +
                "\nactually ="+op1 +
                "\nresult ="+result);
    }

    public void clearCurrentNumber(){
        currentNumber = "0";
    }

    private void verifyNumber(String nextNumber) {
        if(currentNumber.equals("0")){
            currentNumber = nextNumber;
        } else if(nextNumber != null && currentNumber.length() < 9) {
            currentNumber = currentNumber+nextNumber;
        } else {
            System.out.println("Não é possivel adicionar mais");
        }
    }


    //In progress
    //building and thinks forms when the user inside 1 or more operations
    protected void Operations(@NotNull OPERATORS op) {
        switch(op){
            case DIVIDE:
                if(!(currentNumber.equals("0"))){
                    op1 = Double.valueOf(currentNumber);
                    numberOperators++;
                    verifyDivide = true;
                    verifyDoble = true;
                } else throw new ArithmeticException("You can't divide by zero");
                break;

            case MULTIPLY:
                verifyMultiply = true;
                verifySome = false;
                verifyMinus = false;
                if(!verifyDoble){
                    if (verifyDivide == true){
                        divide();
                    }
                    if(numberOperators == 0){
                        op1 = 1;
                        op1 *= Double.valueOf(currentNumber);
                    } else {
                        op1 *= Double.valueOf(currentNumber);
                    }
                    verifyDoble = true;
                    numberOperators++;
                    clearCurrentNumber();
                }
                break;

            case SOME:
                verifyMultiply = false;
                verifySome = true;
                verifyMinus = false;
                if (!verifyDoble){
                    if (verifyDivide == true){divide();}
                    if(numberOperators == 0){
                        op1 = 0;
                        op1 += Double.valueOf(currentNumber);
                    } else {
                        op1 += Double.valueOf(currentNumber);
                    }
                    verifyDoble = true;
                    numberOperators++;
                    clearCurrentNumber();
                }
                break;

            case MINUS:
                verifyMultiply = false;
                verifySome = false;
                verifyMinus = true;
                if(!verifyDoble){
                    if (verifyDivide == true){divide();}
                    if(numberOperators == 0){
                        op1 = Double.valueOf(currentNumber);
                    } else {
                        op1 -= Double.valueOf(currentNumber);
                    };
                    verifyDoble = true;
                    numberOperators++;
                    clearCurrentNumber();
                }
                break;

            case SOLUTION:
                if (verifyDivide == true){
                    divide();
                }
                else if (verifySome == true){
                    Operations(OPERATORS.SOME);
                }
                else if (verifyMinus == true){
                    Operations(OPERATORS.MINUS);
                }
                else if (verifyMultiply == true){
                    Operations(OPERATORS.MULTIPLY);
                }
                else {
                    result = op1;
                }

                if(numberOperators == 0){
                    result = 0;
                } else {
                    result = op1;
                };
                numberOperators++;
                System.out.println("current= "+ currentNumber
                        +"\nnext= "+nextNumber +
                        "\nactually ="+op1 +
                        "\nresult ="+result);
                break;
        }
    }

    private void divide(){
        op2 = Double.valueOf(currentNumber);
        op1/=op2;
        verifyDivide = false;
    }
}
