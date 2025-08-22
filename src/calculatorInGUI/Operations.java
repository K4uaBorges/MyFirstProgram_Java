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

    String nextNumber;
    String currentNumber = "" ;

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

    protected void verifyNumber(String nextNumber){

        String newNextNumber = "";

        if(nextNumber != null || nextNumber.length() < 9) {
            currentNumber = nextNumber+currentNumber;
        }
        else {
            System.out.println("Não é possivel adicionar mais");
        }
        nextNumber = newNextNumber;
    }

}
