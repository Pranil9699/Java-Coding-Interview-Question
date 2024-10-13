import java.util.Scanner;

public class Fifteen extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter the Number");
        int no=sc.nextInt();

        if(no%5==0 && no%11==0)
        display("Yes its Divisible for 5 and 11");
        else
        display("No its Not Divisible for 5 and 11");

    }
}