package Ch01.Excercises;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <= value; i++) {
           fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial is"+fact);
    }
}
