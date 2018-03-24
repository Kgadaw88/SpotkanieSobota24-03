public class OffRoad extends Car {
    private boolean reductor;
    private boolean x4Drive;
    private boolean spareWheel;

    public OffRoad(String brand, String color, String model, int power, int engineCapacity, double fuelConsumption,
                   String reginstrationNumber, boolean reductor, boolean x4Drive, boolean spareWheel) {
        super(brand, color, model, power, engineCapacity, fuelConsumption, reginstrationNumber);
        this.reductor = reductor;
        this.x4Drive = x4Drive;
        this.spareWheel = spareWheel;
    }

    public boolean isReductor() {
        return reductor;
    }

    public boolean isX4Drive() {
        return x4Drive;
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    @Override
    public String toString() {
        return "OffRoad{" + super.toString() +
                ", reductor=" + reductor +
                ", x4Drive=" + x4Drive +
                ", spareWheel=" + spareWheel +
                '}';
    }
}
