import java.util.Scanner;

public class TwentyThree extends Display{
    public static void main(String[] args) {
        
        Scanner sc=getScanner();
        do{
            display("Enter the Choice");
            display("Temp ( celsius to fahrenhiet) -> 1\nTemp ( fahrenheit to celsius) -> 2 \n exit -> 3");
            int choice=sc.nextInt();
            if(choice==1){
                display("Enter the Temp in celcius");
                double celsius=sc.nextDouble();
                double fahrenheit=(celsius*9/5)+32;
                display("Fahrenheit temp is : "+fahrenheit+"F");
            }else if(choice==2){
                display("Enter the Temp in fahrenheit");
                double fahrenheit=sc.nextDouble();
                double celsius=(fahrenheit-32)*5/9;
                display("celsius temp is : "+celsius+"F");
            }else if(choice==3){
            System.exit(1);
            }
        }while(true);
    }
}