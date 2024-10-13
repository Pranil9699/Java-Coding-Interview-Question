import java.util.Scanner;

public class TwentyTwo extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();

        display("Enter the Principal Amount");
        double pricipalA=sc.nextDouble();
        display("Enter the Rate Of Interest");
        double rate=sc.nextDouble();
        display("Enter the time period");
        double time=sc.nextDouble();

        display("Enter the number of times interest in compound per year");
        int n=sc.nextInt();

        double simpleInterest=(pricipalA*rate*time)/100;

        double compoundInterest=pricipalA*Math.pow((1+(rate/(n*100))),(n*time))-pricipalA;

        display("Simple interest is :"+simpleInterest);
        display("Compound interest is :"+compoundInterest);


        
    }
}