package Ch01.Sec08;

import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[10];

        for( int i = 0; i < names.length / 2; i++) {
            names[i] = "";
        }
        names[0] = "Fred";
        names[1] = names[0];
        System.out.println("names="+Arrays.toString(names));

        int[] primes = {17, 19, 23, 29, 31, 37};
        primes = new int[] {2, 3, 5, 7, 11, 13};

        int sum = 0;
        for( int n : primes) {
            sum += n;
        }
        System.out.println("Sum="+sum);

        //Aliasing and copying
        int[] numbers = primes;
        numbers[5] = 42;
        System.out.println("Primes :"+Arrays.toString(primes));

        primes[5] = 13;
        int[] copiedPrimes = Arrays.copyOf(primes, primes.length - 2);
        copiedPrimes[primes.length - 4] = 31;
        System.out.println("Primes :"+Arrays.toString(primes));
        System.out.println("CopiedPrimes :"+Arrays.toString(copiedPrimes));
    }
}
