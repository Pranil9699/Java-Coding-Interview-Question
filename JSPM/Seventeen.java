import java.util.Scanner;

public class Seventeen extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter the percentage of Student:");

        float percentage=sc.nextFloat();
char grade='F';
        if(percentage==100)
        grade='O';
        else if(percentage>90)
        grade='A';
        else if(percentage>80)
        grade='B';
        else if(percentage>70)
        grade='C';
        else if(percentage>60)
        grade='D';
        else if(percentage>50)
        grade='E';
        else
        grade='F';

        display("Student grade is "+grade);
    }
}