import java.util.Scanner;

public class Fourteen extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a,b,c and d values respectively");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        if(a>b){
            if(a>c){
                if(a>d)
                display("Largest of Four is a");
                else
                display("Largest of Four is d");
            }else{
                if(c>d)
                display("Largest of Four is c");
                else
                display("Largest of Four is d");
            }
        }else{
            if(b>c){
                if(b>d)
                display("Largest of Four is b");
                else
                display("Largest of Four is d");
            }else{
                if(c>d)
                display("Largest of Four is c");
                else
                display("Largest of Four is d"); 
            }
        }
    }
}