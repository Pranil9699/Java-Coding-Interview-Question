import java.util.Scanner;

public class TwentyNine extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter 5 subject marks respectively");
        int subArray[]=new int[5];

        for(int i =0 ;i<subArray.length;i++)
        subArray[i]=sc.nextInt();

        display("Student Marks are");
        for (int i : subArray) {
            System.out.print(i+",");
        }
        boolean flag=false;

        for (int i : subArray) {
            if(i<35)
            flag=true;
        }

        if(!flag)
        display("\nStudent pass all subject");
        else
        display("\nStudent not pass all subject");
    }
}