import java.util.Scanner;

public class Eight extends Display {
    public static void main(String[] args) {
        Scanner sc=getScanner();
        display("Enter a,b,c numbers respectively:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
        display("Largest Number is "+largest);
    }
}
