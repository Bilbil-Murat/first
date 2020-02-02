package firstpackage;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Format {
    public static void main(String[] args) {
        float myFloat = 14.4234234f;
        int myNumber = 14;
        double myDouble = 14;
        System.out.format("This is String %f %d %f", myFloat, myNumber, myDouble);
        System.out.println("Do you think");
        String java = "Java is fun";
        float percentageLarge = 78.98f;
        double precentageSmall = 78.98000;
        System.out.format("Do you think %s", java);
        System.out.format("Yes %f of the people think it is fun", percentageLarge);
        System.out.format("Yes %.2f of the people think it is fun", precentageSmall);
    }
}


