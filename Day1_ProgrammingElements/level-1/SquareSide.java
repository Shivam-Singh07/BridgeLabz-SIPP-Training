package Day1_ProgrammingElements;
import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        short perimeter = sc.nextShort();
        short side = (short)(perimeter / 4);
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
