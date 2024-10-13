import java.util.Scanner;

public class Thirteen extends Display{
public static void main(String[] args) {
    Scanner sc=getScanner();
    display("Enter the Number ");
    int no=sc.nextInt();

    int result=0;

    if(no<1){
        display("Not possible becasue no is less than 1 ");
        return;
    }
    for(int i =1;i<=no/2;i++){
        if(no%i==0)
        result+=i;
    }
    if(result==no)
    display("Yes its a Perfect No");
    else
    display("No its Not a Perfect No");
}
}