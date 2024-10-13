import java.util.Scanner;

public class Sixteen extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();

        display("Enter a and b values respectively");
        int a=sc.nextInt();
        int b=sc.nextInt();
        float sum=0;
        sum=a+b;

        if(sum>0) display("Its positive Sum");
        else display("Its Negative Sum");
    }
}