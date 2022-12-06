public class ThreeDigitCode {
    public static void main(String[] args) {
        int uniqueCode = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && k != j && i != k){
                        //if (!(i == j || j == k || i == k)) {
                        uniqueCode ++;
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        System.out.println("There are " + uniqueCode + " unique numbers" );
    }
}
