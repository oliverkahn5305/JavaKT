pimport java.util.Scanner;

public class Teisendamine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisesta kümnendarv: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = "";
        for (int i = 31; i >= 0; i--) {
            int bit = (decimalNumber >> i) & 1;
            binaryNumber += bit;
        }

        System.out.println("Kahendarv: " + binaryNumber);
    }
}