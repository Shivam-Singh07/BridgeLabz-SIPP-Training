package Day1_ProgrammingElements;
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        float base = sc.nextFloat();
        System.out.print("Enter height in inches: ");
        float height = sc.nextFloat();
        float areaInInches = 0.5f * base * height;
        float areaInCm = areaInInches * 6.4516f;
        System.out.println("The area of triangle is " + areaInInches + " sq.inches and " + areaInCm + " sq.cm");
    }
}
