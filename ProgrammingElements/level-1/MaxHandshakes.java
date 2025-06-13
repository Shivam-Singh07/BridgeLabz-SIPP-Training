package Day1_ProgrammingElements;
import java.util.Scanner;
public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        short n = sc.nextShort();
        int handshakes = n * (n - 1) / 2;
        System.out.println("Maximum number of handshakes is " + handshakes);
    }
}
