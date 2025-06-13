package Day1_ProgrammingElements;
import java.util.Scanner;
public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        short unitPrice = sc.nextShort();
        System.out.print("Enter quantity: ");
        short quantity = sc.nextShort();
        int total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
