package Day1_ProgrammingElements;
public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129, sellingPrice = 191;
        int profit = (short)(sellingPrice - costPrice);
        int profitPercent = (profit * 100f) / costPrice;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}
