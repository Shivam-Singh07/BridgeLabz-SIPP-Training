class vehicle
{
    private String brand;
    private String model;
    protected String fuelType;

    vehicle(String brand, String model, String fuelType)
    {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }
}

class car extends vehicle
{
    car(String brand, String model, String fuelType)
    {
        super(brand, model, fuelType);
    }

    void serviceCost()
    {
        if(fuelType.toLowerCase().equals("electric"))
        {
            int serviceFee = 750;
            int totalServiceFee = serviceFee + 3500;
            System.out.println("Service cost for the elctric car is: "+totalServiceFee);
            return;
        }
        else if(fuelType.toLowerCase().equals("petrol"))
        {
            int serviceFee = 750;
            int totalServiceFee = serviceFee + 3500;
            System.out.println("Service cost for the petrol car is: "+totalServiceFee);
            return;
        }
        else if (fuelType.toLowerCase().equals("diesel"))
        {
            int serviceFee = 750;
            int totalServiceFee = serviceFee + 3500;
            System.out.println("Service cost for the diesel car is: "+totalServiceFee);
            return;
        }
    }

    void washingCharges()
    {
        if(fuelType.toLowerCase().equals("electric"))
        {
            System.out.println("Washing charges for the electric car is 2500");
        }
        else
        {
            System.out.println("Washing charges for the car is 1800");
        }
    }

}

class bike extends vehicle
{
    bike(String brand, String model, String fuelType)
    {
        super(brand, model, fuelType);
    }

    void serviceCost()
    {
        if(fuelType.toLowerCase().equals("electric"))
        {
            int serviceFee = 750;
            int totalServiceFee = serviceFee + 2500;
            System.out.println("Service cost for the elctric bike is: "+totalServiceFee);
            return;
        }
        else if(fuelType.toLowerCase().equals("petrol"))
        {
            int serviceFee = 750;
            int totalServiceFee = serviceFee + 1500;
            System.out.println("Service cost for the petrol bike is: "+totalServiceFee);
            return;
        }
    }

    void washingCharges()
    {
        if(fuelType.toLowerCase().equals("electric"))
        {
            System.out.println("Washing charges for the electric bike is 2000");
        }
        else
        {
            System.out.println("Washing charges for the bike is 1500");
        }
    }

}







public class VehicleManagementSystem 
{
    public static void main(String[] args) 
    {
        car car1 = new car("Tesla", "X3", "Electric");
        car1.serviceCost();
        car1.washingCharges();

        bike bike1 = new bike("Bajaj", "Passion Pro", "Petrol");
        bike1.washingCharges();
    }
}
