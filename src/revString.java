import java.util.Scanner;
public class revString {
    public static void main(String[] args) {
        System.out.println("This program will reverse a name.");
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter a name!");
        char [] letters = reader.nextLine().toCharArray(); // reading the char and fill the array
        // use for loops to read from indext length-1 until index 0
        System.out.println(letters.length);
        for(int i = letters.length - 1; i >= 0; i--)
        {
            System.out.println(letters[i]);
        }
    }
}