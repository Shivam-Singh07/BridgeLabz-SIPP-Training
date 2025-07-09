package VehicleRentalApplication;

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
