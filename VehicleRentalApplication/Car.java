package VehicleRentalApplication;

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
