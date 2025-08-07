import java.awt.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class InformationOfSystem {
    public static boolean TRUE_OR_FALSE;
    public static String date = DateFormat.getDateInstance(DateFormat.FULL).format(new Date());
    public static String hours = DateFormat.getTimeInstance(DateFormat.FULL).format(new Date());
    public static String local = Locale.getDefault().getDisplayCountry();
    public static int screenSizeWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    public static int screenSizeHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    public static Scanner sc = new Scanner(System.in);
    public static String os = System.getProperty("os.name").toLowerCase();
    public static String user = System.getProperty("user.name");


    public static void main(String[] args) {

        System.out.println("Deseja saber as informação do sistema?");
        TRUE_OR_FALSE = sc.nextBoolean();
        if(TRUE_OR_FALSE){
            System.out.println("Hoje é dia " + date + " e são exatamente "+ hours);
            System.out.println("A sua região é: "+ local);
            System.out.println("A resoluçao do seu monitor é " + screenSizeWidth + "x" +screenSizeHeight);
            System.out.println("O seu sistema operacional é um: "+os+ " e o nome do utilizador é "+user );
        } else {
            System.out.println("OK, muito obrigado :)");
        }
    }

}