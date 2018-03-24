public class FamilyCar extends  Car{

    private int seatsNumber;
    public FamilyCar(String brand, String color, String model, int power, int engineCapacity, int seatsNumber,
                     double fuelConsumption, String reginstrationNumber) {
        super(brand, color, model, power, engineCapacity, fuelConsumption, reginstrationNumber);

        this.seatsNumber = seatsNumber;
    }

    public FamilyCar(CarDataWrapper carDataWrapper, int seatsNumber) {
        super(carDataWrapper);

        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }



    @Override
    public String toString() {

        return "FamilyCar " + super.toString() +
                "seatsNumber=" + seatsNumber +
                '}';
    }
}
