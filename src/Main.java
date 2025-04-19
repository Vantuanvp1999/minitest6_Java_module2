import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        manager.addVehicle(new Car("C01", "Toyota", 2017, 5));
        manager.addVehicle(new Car("C02", "Lexus", 2021, 7));
        manager.addVehicle(new Motorbike("M01", "Yamaha", 2012, 150));
        manager.addVehicle(new Motorbike("M02", "Honda", 2016, 60));
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Add vehicle");
            System.out.println("2. Remove vehicle");
            System.out.println("3. Display all vehicles");
            System.out.println("4. Show tax report");
            System.out.println("5. Sort by year");
            System.out.println("6. Sort by brand");
            System.out.println("7. Sort by tax");
            System.out.println("8. Print history");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addDifferentTypeVehicle(scanner, manager);
                    break;

                    case 2:
                        System.out.println("Enter ID");
                        String id = scanner.next();
                        manager.removeVehicle(id);
                        break;
                    case 3:
                        manager.displayAllVehicles();
                        break;
                    case 4:
                        manager.displayTaxReport();
                        break;
                    case 5:
                        manager.sortByYear();
                        break;
                        case 6:
                            manager.sortByBrand();
                            break;
                            case 7:
                                manager.sortByTax();
                                break;
                case 8:
                    manager.printHistory();
                    break;
                    case 0:
                        System.out.println("Goodbye!");
            }

        } while (choice != 0);
    }

    private static void addDifferentTypeVehicle(Scanner scanner, VehicleManager manager) {
        int vehicleType;
        do {
            System.out.println("Enter vehicle type:");
            System.out.println("1. Car");
            System.out.println("2. Motorbike");
            System.out.println("0. Exit");
            vehicleType = scanner.nextInt();
            switch (vehicleType) {
                case 1:
                    System.out.println("Enter Car ID:");
                    String carId = scanner.next();
                    System.out.println("Enter car Brand:");
                    String carBrand = scanner.next();
                    System.out.println("Enter car year:");
                    int carYear = scanner.nextInt();
                    System.out.println("Enter car number of seat:");
                    int carNumberOfSeat = scanner.nextInt();
            manager.addVehicle(new Car(carId, carBrand, carYear, carNumberOfSeat));
            break;
            case 2:
                System.out.println("Enter Motorbike's ID:");
                String motorbikeId = scanner.next();
                System.out.println("Enter motorbike's brand:");
                String motorbikeBrand = scanner.next();
                System.out.println("Enter motorbike's year:");
                int motorbikeYear = scanner.nextInt();
                System.out.println("Enter motorbike's engine power:");
                int motorbikeEnginePower = scanner.nextInt();

                manager.addVehicle(new Motorbike(motorbikeId, motorbikeBrand, motorbikeYear, motorbikeEnginePower));
                break;
                case 0:
                    System.out.println("Exit add vehicle!");
            }
        } while (vehicleType != 0);
    }
}
