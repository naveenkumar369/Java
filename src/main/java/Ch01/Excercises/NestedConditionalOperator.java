package Ch01.Excercises;

import java.util.Scanner;

public class NestedConditionalOperator {
    public static void main(String[] args) {
        System.out.println("Please enter first integer:");
        Scanner input = new Scanner(System.in);
        int value1 = input.nextInt();
        System.out.println("Please enter Second integer:");
        int value2 = input.nextInt();
        System.out.println("Please enter Third integer:");
        int value3 = input.nextInt();

        int result_cond = value1 > value2 ? (value1 > value3 ? value1 : value3) : (value2 > value3 ? value2 : value3);
        System.out.println("Max number is:"+result_cond);
        System.out.println("Max number is:"
                +(value1 > value2 ? (value1 > value3 ? value1 : value3) : (value2 > value3 ? value2 : value3)));
        int result = Math.max( value1, Math.max(value2, value3));
        System.out.println("Max number is:"+result);
        System.out.println("Max number is:"+(Math.max( value1, Math.max(value2, value3))));
    }
}
