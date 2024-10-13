import java.util.Scanner;

public class Six extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a number:");
        int no=sc.nextInt();
        if(no>0)
        display("No is Positive");
        else if(no<0)
        display("No is Negative");
        else
        display("No is Zero");
        
        
    }
}
