package calculatorInGUI;


enum OPERATORS{
    DIVIDE,
    MULTIPLY,
    SOME,
    MINUS,
    SOLUTION,
    PERCENTAGE
}


public class Operations {

    protected String nextNumber;
    protected String currentNumber = "0" ;

    //In progress
    protected void Operations(OPERATORS op) {
        switch(op){
            case DIVIDE:
                verifyNumber(nextNumber);
                if(!(currentNumber.isEmpty())){
                    Double.valueOf(currentNumber);
                }
                break;
        }
    }

    protected void verifyNumber(String nextNumber) {

        if(currentNumber.equals("0")){
            currentNumber = nextNumber;
        }
        else if(nextNumber != null && currentNumber.length() < 9) {
            currentNumber = currentNumber+nextNumber;
        }
        else {
            System.out.println("Não é possivel adicionar mais");
        }
    }

}
