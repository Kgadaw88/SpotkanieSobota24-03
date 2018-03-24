public class Bus extends Car{

    private int seatsNumber;
    private int standingPlaces;
    private double length;
    private double height;


    public Bus(String brand, String color, String model, int power, int engineCapacity, double fuelConsumption,
               String reginstrationNumber, int seatsNumber, int standingPlaces, double length, double height) {
        super(brand, color, model, power, engineCapacity, fuelConsumption, reginstrationNumber);

        this.seatsNumber = seatsNumber;
        this.standingPlaces = standingPlaces;
        this.length = length;
        this.height = height;
    }

    public Bus(CarDataWrapper carDataWrapper, int seatsNumber, int standingPlaces, double length, double height) {
        super(carDataWrapper);

        this.seatsNumber = seatsNumber;
        this.standingPlaces = standingPlaces;
        this.length = length;
        this.height = height;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                ", seatsNumber=" + seatsNumber +
                ", standingPlaces=" + standingPlaces +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
