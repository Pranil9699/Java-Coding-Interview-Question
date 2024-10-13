import java.util.Scanner;

public class TwentyEight extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a Character");
        char ch=sc.next().charAt(0);
        
        if(ch>='A'&& ch <='Z')
        display("Its Uppercase Character");
        else if(ch>='a' && ch<='z')
        display("Its lowercase Character");
        else if(ch>='0' && ch<='9')
        display("Its Digit Character");
        else
        display("Its Special Character");
    }
}