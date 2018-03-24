import java.util.Scanner;

public class Menu {

    public static int mainScreen(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add cars");
        System.out.println("2. List cars");
        System.out.println("3. Exit");

        return scanner.nextInt();
    }

    public static int carTypeScreen(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Family Car");
        System.out.println("2. Bus");
        System.out.println("3. Off road");
        System.out.println("4. Back");

        return scanner.nextInt();
    }
}
