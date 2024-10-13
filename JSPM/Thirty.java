import java.util.Scanner;

public class Thirty extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        
        display("Enter the a , b , c side of triangle");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if((a+b>c) && (b+c>a) && (a+c>b)){

            if(a==b && b==c)
            display("THis is Equilateral Triangle");
            else if(a==b|| b==c || c== a)
            display("THis is Isosceles Triangle");
            else
            display("This is Scalene Triangle");
        }else{
            display("This a b c side could not make a valid triangle");
        }
    }
}