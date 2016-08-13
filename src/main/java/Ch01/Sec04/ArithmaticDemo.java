package Ch01.Sec04;

public class ArithmaticDemo {
    public static void main(String[] args) {
        System.out.println(17 / 5);
        System.out.println(17 % 5);
        System.out.println(Math.floorMod(17, 5));

        System.out.println(-17 / 5);
        System.out.println(-17 % 5);
        System.out.println(Math.floorMod(-17, 5));
        System.out.println(Math.floorMod(17, -5));

        int[] a = {17, 29};
        int n = 0;
        System.out.printf("%d %d\n", a[n++], n);
        n = 0;
        System.out.printf("%d %d\n", a[++n], n);

        System.out.println(Math.pow(10, 9));
        System.out.println(Math.sqrt(1000000));

        double x = 42;
        System.out.println(x);

        float f =  123456789;
        System.out.println(f);

        x = 3.75;
        n = (int) x;
        System.out.println(n);

        n = (int) Math.round(x);
        System.out.println(n);

        System.out.println('J' +1);
        char next = (char) ('J' + 1);
        System.out.println(next);

        n = (int) 3000000000L;
        System.out.println(n);

    }
}
