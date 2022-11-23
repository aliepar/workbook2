import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string to reverse:");

        String str = myObj.nextLine();
        String revString = "";
        int  wordlength= str.length();
        for(int i = wordlength - 1; i >= 0; i--)
        {
            revString = new StringBuilder().append(revString).append(str.charAt(i)).toString();
        }
        //read.close();
        System.out.println("Reversed string is:");
        System.out.println(revString);
    }
}
