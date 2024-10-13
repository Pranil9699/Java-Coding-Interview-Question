import java.util.Scanner;

public class Seven extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a number:");
        int no=sc.nextInt();
        if(no%2==0)
        display("No is Even");
        else
        display("No is Odd");
    }
    
}
