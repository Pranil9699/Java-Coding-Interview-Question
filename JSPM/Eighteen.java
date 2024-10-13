import java.util.Scanner;

public class Eighteen extends Display{
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a , b and c respectively");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a<b){
            if(a<c)
            display("A is smallest");
            else
            display("C is smallest");
        }else{
            if(b<c)
            display("B is smallest");
            else display("C is smallest");
        }
    }
}