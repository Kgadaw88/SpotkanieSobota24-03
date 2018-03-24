public class Car {
    private String brand;
    private String color;
    private String model;
    private int rentPrice;
    private int power;
    private int engineCapacity;
    private double fuelConsumption;
    private String registrationNumber;


    public Car(String brand, String color, String model, int power, int engineCapacity, double fuelConsumption, String registrationNumber) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.power = power;
        this.engineCapacity = engineCapacity;
        this.fuelConsumption = fuelConsumption;
        this.registrationNumber = registrationNumber;
        CarRepository.carsList.add(this);
    }

    public Car(CarDataWrapper carDataWrapper){
        this.brand = carDataWrapper.brand;
        this.color = carDataWrapper.color;
        this.model = carDataWrapper.model;
        this.power = carDataWrapper.power;
        this.engineCapacity = carDataWrapper.engineCapacity;
        this.fuelConsumption = carDataWrapper.fuelConsumption;
        this.registrationNumber = carDataWrapper.registrationNumber;
        CarRepository.carsList.add(this);
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public int getPower() {
        return power;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }


    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", rentPrice=" + rentPrice +
                ", power=" + power +
                ", engineCapacity=" + engineCapacity +
                ", fuelConsumption=" + fuelConsumption +
                ", registrationNumber='" + registrationNumber + '\'';
    }
}
