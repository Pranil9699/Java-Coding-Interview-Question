import java.util.Scanner;

public class Twenty extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter the lower range and upper range number");
        int lowerRangeNo=sc.nextInt();
        int upperRangeNo=sc.nextInt();

        display("Enter the number");
        int number=sc.nextInt();

        if(lowerRangeNo<=number && upperRangeNo>=number)
        display("With in the Range");
        else
        display("Not within the Range");

    }
}