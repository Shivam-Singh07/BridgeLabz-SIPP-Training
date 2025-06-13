package Day1_ProgrammingElements;
import java.util.Scanner;
public class FeetConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        short feet = sc.nextShort();
        double yards = feet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("Distance in yards is " + yards + " and in miles is " + miles);
    }
}
