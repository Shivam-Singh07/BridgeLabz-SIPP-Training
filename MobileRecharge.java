package hahahah;
import java.util.Scanner;
public class MobileRecharge 
{
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int totalAmount = 5000;
		
		for(int i = 0;i<=1;i++)
		{
			System.out.println("Write your operator: JIO, AIRTEL, VI :-");
			String operatorName = sc.next();
			if(operatorName.toLowerCase().equals("jio"))
			{
				System.out.println("Enter your number:- ");
				long number = sc.nextLong();
				System.out.println("------------ OFFERS -------------");
				System.out.println("-> for 899 get JioHotstar subscription free for 3 month. \n-> for 999 get Amazon Prime subscription for 3 month. \n-> for 799 get 20 GB extra data.");
				System.out.println("-------------Select your plan------------- \n -> 399 \n -> 799 \n -> 899 \n -> 999");
				System.out.print("Enter the amount :- ");
				int recharge = sc.nextInt();
				System.out.println();
				System.out.println("Your recharge is done for " + recharge + " \nAnd your remaning amount is " + (totalAmount-recharge));
				System.out.print("Do you want to recharge another number(yes or no) :- ");
				String response = sc.next();
				if(response.toLowerCase().equals("yes"))
				{
					i = 0;
				}
				
			}
			
			else if(operatorName.toLowerCase().equals("airtel"))
			{
				System.out.println("Enter your number:- ");
				long number = sc.nextLong();
				System.out.println("------------ OFFERS -------------");
				System.out.println("-> for 899 get JioHotstar subscription free for 3 month. \n-> for 999 get Amazon Prime subscription for 3 month. \n-> for 799 get 20 GB extra data.");
				System.out.println("-------------Select your plan------------- \n -> 399 \n -> 799 \n -> 899 \n -> 999");
				System.out.print("Enter the amount :- ");
				int recharge = sc.nextInt();
				System.out.println();
				System.out.println("Your recharge is done for " + recharge + " \nAnd your remaning amount is " + (totalAmount-recharge));
				System.out.print("Do you want to recharge another number(yes or no) :- ");
				String response = sc.next();
				if(response.toLowerCase().equals("yes"))
				{
					i = 0;
				}
				
			}
			
			else if(operatorName.toLowerCase().equals("vi"))
			{
				System.out.println("Enter your; number:- ");
				long number = sc.nextLong();
				System.out.println("------------ OFFERS -------------");
				System.out.println("-> for 899 get JioHotstar subscription free for 3 month. \n-> for 999 get Amazon Prime subscription for 3 month. \n-> for 799 get 20 GB extra data.");
				System.out.println("-------------Select your plan------------- \n -> 399 \n -> 799 \n -> 899 \n -> 999");
				System.out.print("Enter the amount :- ");
				int recharge = sc.nextInt();
				System.out.println();
				System.out.println("Your recharge is done for " + recharge + " \nAnd your remaning amount is " + (totalAmount-recharge));
				System.out.print("Do you want to recharge another number(yes or no) :- ");
				String response = sc.next();
				if(response.toLowerCase().equals("yes"))
				{
					i = 0;
				}
				
			}
		}
		
		sc.close();
			
			
		
	}
}
