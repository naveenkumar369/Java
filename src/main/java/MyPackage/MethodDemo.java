package MyPackage;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Random;

public class MethodDemo {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Hello World!".length());
        System.out.println(new Random().nextInt());

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());

        System.out.println("Integer");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        System.out.println("Long");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println("Short");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println("Byte");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

    }
}
