// Vehicle Rental Application Scenario:
// Build a system for renting bikes, cars, and trucks to customers.

// Concepts Used:
// ● Class: Vehicle, Bike, Car, Truck, Customer (Scenario-based problems)
// ● Constructors: Custom constructors for different vehicle types
// ● Access Modifiers: protected for vehicle attributes to allow subclass access
// ● Interface: Rentable with method calculateRent(int days)
// ● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)

// OOP Concepts:
// ○ Abstraction: Rentable abstracts rental behavior
// ○ Inheritance: Car, Bike, Truck inherit from Vehicle
// ○ Polymorphism: Rent calculation differs by vehicle type
// ○ Encapsulation: All fields hidden behind getters/setters

import java.util.Scanner;

interface Rentable {
    void calculateRent(int days);
}

abstract class Vehicle implements Rentable {
    protected String vehicleType;
    protected String vehicleModel;
    protected String fuelType;

    public Vehicle(String vehicleType, String vehicleModel, String fuelType) {
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.fuelType = fuelType;
    }
}

class Car extends Vehicle {
    public Car(String vehicleType, String vehicleModel, String fuelType) {
        super(vehicleType, vehicleModel, fuelType);
    }

    @Override
    public void calculateRent(int days) {
        int extraCharges = 450;
        int rent = 2500;
        int totalCharges = ((extraCharges + rent) * days ) * 18 / 100;
        System.out.println("Total charges for renting the car is: " + totalCharges + " for " + days);
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleType, String vehicleModel, String fuelType) {
        super(vehicleType, vehicleModel, fuelType);
    }

    @Override
    public void calculateRent(int days) {
        int extraCharges = 150;
        int rent = 1300;
        int totalCharges = ((extraCharges + rent) * days ) * 18 / 100;
        System.out.println("Total charges for renting the bike is: " + totalCharges+ " for " + days);
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleType, String vehicleModel, String fuelType) {
        super(vehicleType, vehicleModel, fuelType);
    }

    @Override
    public void calculateRent(int days) {
        int extraCharges = 750;
        int rent = 4500;
        int totalCharges = ((extraCharges + rent) * days ) * 18 / 100;
        System.out.println("Total charges for renting the truck is: " + totalCharges+ " for " + days);
    }
}



public class vehicleRentalApplication {
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
        
    
        
    }
}