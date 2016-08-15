package Ch01.Excercises;
import java.util.Scanner;
public class MinMaxOfDouble {
    public static void main(String[] args) {
        System.out.println("Min of Double"+ Double.MIN_VALUE);
        System.out.println("Max of Double"+ Double.MAX_VALUE);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a long decimal value:");
        double value = input.nextDouble();
        System.out.println("Min of Double"+ Math.nextUp(value));
        System.out.println("Max of Double"+ Math.nextDown(value));
    }
}
