import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {
    public static void start(){

        boolean exitFlag = false;
        do {
            int choice = Menu.mainScreen();

            switch (choice){
                case 1:
                    typeCarFlow();
                    break;
                case 2:
                    CarRepository.showCars();
                    break;
                case 3:
                    exitFlag = true;
                    break;
            }
        } while (!exitFlag);

        System.exit(0);
    }

    private static void typeCarFlow(){
        int choice = Menu.carTypeScreen();
        CarDataWrapper c1;
        Scanner scanner = new Scanner(System.in);

        switch (choice){
            case 1:
              c1 = readMainParameters();
              scanner = new Scanner(System.in);
              System.out.print("Seat Numbers: ");
              int seatsNumber = scanner.nextInt();

              FamilyCar fc = new FamilyCar(c1, seatsNumber);

            case 2:
                c1 = readMainParameters();
                System.out.print("Seat Numbers: ");
                int seats = scanner.nextInt();

                System.out.print("Length: ");
                int standingPlaces = scanner.nextInt();

                System.out.print("Length: ");
                int length = scanner.nextInt();

                System.out.print("Height: ");
                int height = scanner.nextInt();

                Bus b = new Bus(c1, seats, standingPlaces, length, height);
                break;
              }

    }

    private static CarDataWrapper readMainParameters(){
        Scanner scanner = new Scanner(System.in);

        CarDataWrapper carDataWrapper =  new CarDataWrapper();

        System.out.print("Brand: ");
        carDataWrapper.brand = scanner.nextLine();
        System.out.print("Model: ");
        carDataWrapper.model = scanner.nextLine();
        System.out.print("Color: ");
        carDataWrapper.color = scanner.nextLine();

        carDataWrapper.rentPrice = ourScanner("Rent Price");

        System.out.print("Power: ");
        carDataWrapper.power= scanner.nextInt();
        System.out.print("Engine Capacity: ");
        carDataWrapper.engineCapacity= scanner.nextInt();
        System.out.print("Fuel Consumption: ");
        carDataWrapper.fuelConsumption = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Registration Number: ");
        carDataWrapper.registrationNumber = scanner.nextLine();

        return carDataWrapper;
    }

    public static int ourScanner(String parameterName){
        int resoult = 0;
        while (true) {
            try {
                Scanner scanner2 = new Scanner(System.in);
                System.out.print(parameterName + ": ");
                resoult = scanner2.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Zepsuło się");
                continue;
            }
            break;
        }
        return resoult;
    }
}
