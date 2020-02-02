package firstpackage;
import java.util.Scanner;
public class KeyboardInputquestions {
    public static void main(String[] args) {
        Scanner myself = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String myName;
        myName= myself.nextLine();
        System.out.println("My Age : ");
        int myAge;
        myAge = myself.nextInt();
        System.out.println("My Weight :");
        float myWeight;
        myWeight = myself.nextFloat();
        System.out.println("My hair color: ");
        String myhairColor;
        myhairColor = myself.next();


    }

}