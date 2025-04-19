public class Car extends Vehicle {
    private int numberOfSeats;

    public Car() {
    }

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String id, String brand, int year, int numberOfSeats) {
        super(id, brand, year);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void dispayInfo() {
        System.out.println("Car number " + getId() +" "+getBrand()+" "+getYear()+ " has " + numberOfSeats + " seats");
    }

    @Override
    public double calculateTax() {
        return numberOfSeats * 300;
    }
}
