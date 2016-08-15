package Ch01.Excercises;

import java.util.Scanner;

public class IntegerConversion {
    public static void main(String[] args) {
        System.out.println("Please enter an Integer:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String a_byte = Integer.toBinaryString(a);

        System.out.println("Integer to Binary:"+Integer.toBinaryString(a));
        System.out.println("Integer to Octal:"+Integer.toOctalString(a));
        System.out.println("Integer to Hexa Decimal:"+Integer.toHexString(a));

        System.out.printf("Integer conversion to \n Byte :%s \n Octal :%o \n HexaDecimal :%x\n", a_byte, a, a);

        float a_float = (float) 1 / a;

        System.out.println("Float to Hexa Decimal "+ Float.toHexString(a_float));
    }
}
