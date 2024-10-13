import java.util.Scanner;

public class TwentyFour extends Display {
    public static void main(String[] args) {
        Scanner sc = getScanner();

        do {

            display("Enter your Choice");
            display("1.Perimeter of Rectangel\n2.Volumn of Cylinder\n3.Perimeter of Square\n4.Volumn of Sphere\n5.Volumn of Cone\n6.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                display("Enter the length and breadth of Rectangel");
                float length = sc.nextFloat();
                float breadth = sc.nextFloat();
                double primeterOfRectangel = 2 * (length + breadth);
                display("Perimeter of Rectangel :"+primeterOfRectangel);
            }else if(choice == 2){
                display("Enter the radius and heigth of Cylinder");
                float radius = sc.nextFloat();
                float heigth = sc.nextFloat();
                double volumnOfCylinder = Math.PI*Math.pow(radius, 2)*heigth;
                display("Volumn Of Cylinder :"+volumnOfCylinder);
            }else if(choice==3){
                display("Enter the side length of Square");
                float side = sc.nextFloat();
                double perimeterOfSquare = side*4;
                display("Perimeter Of Square :"+perimeterOfSquare);
            }else if(choice==4){
                display("Enter the radius of Sphere");
                float radius = sc.nextFloat();
                double volumnOfSphere = (4.0/3.0)*Math.PI*Math.pow(radius,3);
                display("Volumn Of Sphere :"+volumnOfSphere);
            }else if(choice==5){
                display("Enter the height and radius of Cone");
                float height = sc.nextFloat();
                float radius = sc.nextFloat();
                double volumnOfCone = (Math.PI * Math.pow(radius, 2) * height) / 3;
                display("Volumn of Cone :"+volumnOfCone);
            }else if(choice==6)
            System.exit(1);
        } while (true);
    }
}