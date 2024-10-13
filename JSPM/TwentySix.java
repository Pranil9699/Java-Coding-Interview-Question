import java.util.Scanner;

public class TwentySix extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter number based on month");
        int number=sc.nextInt();

        switch(number){
            case 1 -> display("JAN");
            case 2 -> display("FEB");
            case 3 -> display("MAR");
            case 4 -> display("APR");
            case 5 -> display("MAY");
            case 6 -> display("JUN");
            case 7 -> display("JUL");
            case 8 -> display("AUG");
            case 9 -> display("SEP");
            case 10 -> display("OCT");
            case 11 -> display("NOV");
            case 12 -> display("DEC");
            default -> display("Wrong number inputed...");
        }
    }
}