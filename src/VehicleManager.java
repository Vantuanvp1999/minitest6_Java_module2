import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles= new ArrayList<>();
    private LinkedList<String> operationHistory= new LinkedList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        operationHistory.add("Add vehicle");
    }
    public void removeVehicle(String id) {
        for(Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                vehicles.remove(vehicle);
            }
        }
        operationHistory.add("Remove vehicle");
    }
    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.dispayInfo();
        }
        operationHistory.add("Display all vehicles");
    }
    public void displayTaxReport() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getId()+" tax report: "+vehicle.calculateTax());
        }
        operationHistory.add("Display tax report");
    }
    public void sortByYear() {
        Collections.sort(vehicles);
        operationHistory.add("Sort by year");
    }
    public void sortByBrand() {
        Comparator<Vehicle> byBrand = new Comparator<Vehicle>() {
            public int compare(Vehicle vehicle1, Vehicle vehicle2) {
                return vehicle1.getBrand().compareTo(vehicle2.getBrand());
            }
        };
        Collections.sort(vehicles, byBrand);
        operationHistory.add("Sort by brand");
    }
    public void sortByTax() {
        Comparator<Vehicle> byTax =new Comparator<Vehicle>() {
            public int compare(Vehicle vehicle1, Vehicle vehicle2) {
                return (int) vehicle1.calculateTax() - (int) vehicle2.calculateTax();
            }
        };
        Collections.sort(vehicles, byTax);
        operationHistory.add("Sort by Tax");
    }
    public void printHistory() {
        for (String operation : operationHistory) {
            System.out.println(operation);
        }
        operationHistory.add("Print history");
    }

}
