import java.util.Scanner;

public class SumNUMBERS {
    public static void main(String[] args) {
        int sumTotal = 0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input a number to sum to:");
        int inputNumber = myObj.nextInt();
       /* int nr = 1;
        while(nr <= inputNumber){
          sumTotal += nr ;
            System.out.println(nr);
              nr ++;
        }*/
        for (int i = 1; i <= inputNumber; i ++){
        System.out.println(i);
            sumTotal += i;
        }
        System.out.println("The sumTotal is " +sumTotal);
    }
}
