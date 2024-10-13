import java.util.Scanner;

public class TwentySeven extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter number based on week day");
        int number=sc.nextInt();

        switch(number){
            case 1 -> display("SUNDAY");
            case 2 -> display("MONDAY");
            case 3 -> display("TUESDAY");
            case 4 -> display("WEDNESDAY");
            case 5 -> display("THURSDAY");
            case 6 -> display("FRIDAY");
            case 7 -> display("SATURDAY");
            
            default -> display("Wrong number inputed...");
        }
    }
}