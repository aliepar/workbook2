import java.io.Reader;
import java.util.Scanner;
//Scan//ner reader= new Scanner(System.in);
public class timeTables {

    public static void main(String[] args) {
        int i ;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputNumber = myObj.nextInt();
        System.out.println("number is: " +inputNumber);
        for (i = 1; i <= 12 ; i++){
           int number1 = inputNumber * i;
            //System.out.println("time table is:" +number1);
            System.out.println(inputNumber + "x" + i + "=" + number1);
        }
    }
}
