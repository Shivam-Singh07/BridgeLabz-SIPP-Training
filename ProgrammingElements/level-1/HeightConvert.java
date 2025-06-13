package Day1_ProgrammingElements;
import java.util.Scanner;
public class HeightConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short cm;
        System.out.print("Enter your height in cm: ");
        cm = sc.nextShort();
        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        double remainingInches = inches % 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
    }
}
