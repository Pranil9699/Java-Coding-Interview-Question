import java.util.Scanner;

public class Four extends Display {
    public static void main(String[] args) {
        Scanner sc = getScanner();
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        display("Sum of a +b = "+(a+b));
    }
}
