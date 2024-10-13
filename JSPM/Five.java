import java.util.Scanner;

public class Five extends Display {
    public static void main(String[] args) {
        
        Scanner sc=getScanner();
        display("Enter A,B,C,D,E,F,G,H values respectively");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        int E=sc.nextInt();
        int F=sc.nextInt();
        int G=sc.nextInt();
        int H=sc.nextInt();

        float firstExp=A*(B+C/3)+D;
        float secondExp=B+C-D/E*F-100+G-H;
        float thirdExp=A-B*25+45*C-D-100;
        float fourExp=A/B-C*D/4+25-E*F;
        float fiveExp=A+B/C-D/E+10*F;

        display("First Expression = "+firstExp);
        display("Second Expression = "+secondExp);
        display("Three Expression = "+thirdExp);
        display("Four Expression = "+fourExp);
        display("Five Expression = "+fiveExp);

    }
}
