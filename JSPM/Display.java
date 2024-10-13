import java.util.Scanner;
public class Display {
    public static Scanner sc= new Scanner(System.in);
    public static void display(String obj) {
        System.out.println(obj);
    }
    public static Scanner getScanner(){
        return sc;
    }
}
