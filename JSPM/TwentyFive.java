import java.util.Scanner;

public class TwentyFive extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a Character");
        char ch=sc.next().charAt(0);
        
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
        display("Its Vowel");
        else if((ch>='A'&& ch <='Z')||(ch>='a' && ch<='z'))
        display("Its Consonant");
        else if(Character.isDigit(ch))
        display("Its Digit");
        else
        display("Wrong Character");
    }
}