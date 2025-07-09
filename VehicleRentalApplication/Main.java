package VehicleRentalApplication;
import java.util.Scanner;

public class Main 
{
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        
        boolean exit = false;
        while(!exit)
        {
            System.out.println("Choose the vehicle you want to rent:");
            System.out.println("1. Car \n2. Bike \n3. Truck \n4. Exit");
            int choose = sc.nextInt();
            sc.nextLine();
            int days;
            switch(choose)
            {
                case 1:
                    Car car1 = new Car("Car",  "Scorpio", "Disel");
                    System.out.println("Enter the number of days to rent: ");
                    days = sc.nextInt();
                    sc.nextLine();
                    car1.calculateRent(days);
                    break;
                
                case 2:
                    Bike bike1 = new Bike("Bike", "Splendor", "Petrol");
                    System.out.println("Enter the number of days to rent: ");
                    days = sc.nextInt();
                    sc.nextLine();
                    bike1.calculateRent(days);
                    break;
                
                case 3:
                    Truck truck1 = new Truck("Bike", "Splendor", "Petrol");
                    System.out.println("Enter the number of days to rent: ");
                    days = sc.nextInt();
                    sc.nextLine();
                    truck1.calculateRent(days);
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Enter the correct details.");
                    break;
            }
        }
        
        sc.close();
        
    }    
}
