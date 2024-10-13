import java.util.Scanner;

public class TwentyOne extends Display{

    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a and b respectively");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product=a*b;

        if(product>500) display("Product of two number is greater than 500");
        else display("Product of two number is Not greater than 500");
    }
}