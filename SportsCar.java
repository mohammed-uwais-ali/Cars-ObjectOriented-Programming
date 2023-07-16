public class SportsCar extends Car {
    private boolean turbo;

    public SportsCar(String brand, String color, int year, boolean turbo) {
        super(brand, color, year);
        this.turbo = turbo;
    }

    public boolean hasTurbo() {
        return turbo;
    }

    @Override
    public void accelerate() {
        if (turbo) {
            System.out.println("The " + getColor() + " " + getBrand() + " sports car is accelerating with turbo.");
        } else {
            System.out.println("The " + getColor() + " " + getBrand() + " sports car is accelerating.");
        }
    }

    public void drift() {
        System.out.println("The " + getColor() + " " + getBrand() + " sports car is drifting!");
    }
}
