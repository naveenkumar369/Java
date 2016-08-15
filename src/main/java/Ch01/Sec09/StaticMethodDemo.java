package Ch01.Sec09;

import java.util.Scanner;

public class StaticMethodDemo {
    public static double average(double x, double y) {
        return  ( x + y) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Average is:" + average(a, b));
    }
}
