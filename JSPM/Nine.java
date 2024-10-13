import java.util.Scanner;

public class Nine extends Display{
    
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a year:");
        int year=sc.nextInt();
        if((year%4==0 && year %100 !=0)|| (year%400==0))
        display("Year is leap year");
        else
        display("Year is Not leap Year");
    }
}
