import java.util.Scanner;

public class CoffeeType 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int flag = 1;
        while(flag == 1)
        {
            System.out.print("Select your coffee: \n -> 1. Americano \n -> 2. Latte \n -> 3. Cappuccino \n");
            int coffee = sc.nextInt();
            System.out.println();
            System.out.print("Enter your quantity: " );
            int quantity = sc.nextInt();
            System.out.println();
            int total = 0;
            int price = 0;
            int gst = 0;
            switch (coffee) 
            {
            case 1:
                price = 350;
                gst = quantity*price * 12 / 100;
                total = quantity * price + gst;
                System.out.println("GST amount is: "+ gst);
                System.out.println("Your total is: "+total);
                break;

            case 2:
                price = 290;
                gst = quantity*price * 12 / 100;
                total = quantity * price + gst;
                System.out.println("GST amount is: "+ gst);
                System.out.println("Your total is: "+total);
                break;     
                
            case 3:
                price = 390;
                gst = quantity*price * 12 / 100;
                total = quantity * price + gst;
                System.out.println("GST amount is: "+ gst);
                System.out.println("Your total is: "+total);
                break;
            default:
                System.out.println("Please enter correct details.");
                break;
            }   
            System.out.print("Do you want another order:" );
            String ans = sc.next();
            if(ans.equals("exist"))
            {
                flag = 0;
            }
        }
    }    
}