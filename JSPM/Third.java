import java.util.Scanner;

public class Third extends Display {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        String Std=sc.nextLine();
        char Div=sc.nextLine().charAt(0);
        String College=sc.nextLine();

        display("Name - "+name);
        display("Std - "+Std);
        display("Div - "+Div);
        display("College - "+College);

    }
}
