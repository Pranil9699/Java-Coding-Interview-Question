import java.util.Scanner;

public class Ten extends Display{
    public static void main(String[] args) {
        
        Scanner sc=getScanner();
        display("Enter a Number");
        int no=sc.nextInt();
        boolean check=false;

        for(int i=2;i<no;i++){
            if(no%i==0){
            check=true;
            break;
        }
        }
        if(!check)
        display("No is Prime Number");
        else
        display("Number is not Prime Number");
    }
}
