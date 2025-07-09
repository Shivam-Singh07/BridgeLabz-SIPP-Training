package VehicleRentalApplication;

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
