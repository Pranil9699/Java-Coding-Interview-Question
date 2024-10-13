import java.util.Scanner;

public class Twelve extends Display{

    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter the Number");
        int number=sc.nextInt();
        int result=0,count=0;
        int originalNo=number;

        while(number!=0){
            count++;
            number/=10;
        }
        number=originalNo;
        while(number!=0){
            result+=Math.pow(number%10, count);
            number/=10;
        }
        if(originalNo==result)
        display("Number is Armstrong Number");
        else
        display("Number is Not Armstrong Number");

    }
}