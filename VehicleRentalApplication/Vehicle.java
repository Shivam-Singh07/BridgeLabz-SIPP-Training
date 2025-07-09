package VehicleRentalApplication;

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
