package Ch01.Excercises;
import java.util.Scanner;
public class PrintString {
    public static void main(String[] args) {
        System.out.println("Please enter any string");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        String output = " ";
        for(int i=0; i<= (value.length() - 1); i++) {
            if( !value.substring(i, i+1).equals(" ")) {
                output = output + value.substring(i, i+1);
            }
        }
        System.out.println(output);
    }
}
