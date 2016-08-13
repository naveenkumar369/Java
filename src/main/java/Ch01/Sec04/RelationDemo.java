package Ch01.Sec04;

public class RelationDemo {
    public static void main(String[] args) {
        int length = 10;
        int n = 7;
        System.out.println(0 < n && n < length);

        int s = 30;
        System.out.println(n != 0 && s + (100 - s) / n < 50);
        n = 0;
        System.out.println(n != 0 && s + (100 - s) / n < 50);
        System.out.println(n == 0 || s + (1 - s) / n >= 50);

    }
}
