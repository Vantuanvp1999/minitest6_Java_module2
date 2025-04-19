public class Motorbike extends Vehicle {
    private int enginePower;

    public Motorbike() {
    }

    public Motorbike(int enginePower) {
        this.enginePower = enginePower;
    }

    public Motorbike(String id, String brand, int year, int enginePower) {
        super(id, brand, year);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
   public void dispayInfo() {
        System.out.println("Motorbike: " +getId() +" "+ getBrand() + " " + getYear() + " " + getEnginePower());
    }

    @Override
    public double calculateTax() {
        if(enginePower < 100){
            return 500;
        }else {
            return 1000;
        }
    }
}
