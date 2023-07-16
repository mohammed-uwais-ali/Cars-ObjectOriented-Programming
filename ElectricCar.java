public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String color, int year, int batteryCapacity) {
        super(brand, color, year);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void start() {
        System.out.println("The " + getColor() + " " + getBrand() + " electric car is starting silently.");
    }

    public void charge() {
        System.out.println("The " + getColor() + " " + getBrand() + " electric car is charging.");
    }
}
