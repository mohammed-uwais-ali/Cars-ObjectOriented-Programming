public class Car {
    private String brand;
    private String color;
    private int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("The " + color + " " + brand + " is starting.");
    }

    public void accelerate() {
        System.out.println("The " + color + " " + brand + " is accelerating.");
    }

    public void brake() {
        System.out.println("The " + color + " " + brand + " is braking.");
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }
}
