import java.util.Scanner;

public class Eleven extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter the Number:");
        int no=sc.nextInt();
        int reverseNo=0,originalNo=no;

        while(no!=0){
            reverseNo=(reverseNo*10)+no%10;
            no/=10;
        }

        if(originalNo==reverseNo)
        display("Its Palindrome");
        else
        display("Its Not Palindrome");
    }
}
