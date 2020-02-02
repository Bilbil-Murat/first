package firstpackage;
import java.util.Scanner;

import static java.lang.System.out;

public class CirclePerimeterInput {
    public static void main(String[] args) {
        Scanner scannerMine = new Scanner(System.in);
       System.out.print("Please ener the radius:");
        float radius;
        radius = scannerMine.nextFloat();
        System.out.println(" The perimeter of this circle is : " + (2*3.14*radius));
        System.out.format(" Perimeter with 3 fractional part : %.3f",2*3.14*radius);

    }
}