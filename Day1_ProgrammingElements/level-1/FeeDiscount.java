package Day1_ProgrammingElements;
import java.util.Scanner;
public class FeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short fee, discountPercent;
        System.out.print("Enter the student fee: ");
        fee = sc.nextShort();
        System.out.print("Enter the discount percentage: ");
        discountPercent = sc.nextShort();
        int discount = fee * discountPercent / 100;
        int finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
