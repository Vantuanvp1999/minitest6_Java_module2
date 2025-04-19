public abstract class Vehicle implements Taxable, Comparable<Vehicle> {
    private String id;
    private String brand;
    private int year;
    public abstract void dispayInfo();

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(year, o.year);
    }

    public Vehicle() {
    }

    public Vehicle(String id, String brand, int year) {
        this.id = id;
        this.brand = brand;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
