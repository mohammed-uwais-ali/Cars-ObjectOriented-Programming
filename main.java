public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 2022);
        System.out.println("Car: " + car1.getBrand() + ", Color: " + car1.getColor() + ", Year: " + car1.getYear());
        car1.start();
        car1.accelerate();
        car1.brake();
        car1.honk();
        System.out.println();

        SportsCar sportsCar1 = new SportsCar("Ferrari", "Yellow", 2023, true);
        System.out.println("Sports Car: " + sportsCar1.getBrand() + ", Color: " + sportsCar1.getColor() + ", Year: " + sportsCar1.getYear());
        sportsCar1.start();
        sportsCar1.accelerate();
        sportsCar1.brake();
        sportsCar1.drift();
        sportsCar1.honk();
        System.out.println();

        ElectricCar electricCar1 = new ElectricCar("Tesla", "Blue", 2023, 85);
        System.out.println("Electric Car: " + electricCar1.getBrand() + ", Color: " + electricCar1.getColor() + ", Year: " + electricCar1.getYear());
        electricCar1.start();
        electricCar1.accelerate();
        electricCar1.brake();
        electricCar1.charge();
        electricCar1.honk();


        /*Output, shocasing how inheritance works and how child classes can perform method overriding 
        Car: Toyota, Color: Red, Year: 2022
        The Red Toyota is starting.
        The Red Toyota is accelerating.
        The Red Toyota is braking.
        Honk! Honk!
        
        Sports Car: Ferrari, Color: Yellow, Year: 2023
        The Yellow Ferrari sports car is starting.
        The Yellow Ferrari sports car is accelerating with turbo.
        The Yellow Ferrari sports car is braking.
        The Yellow Ferrari sports car is drifting!
        Honk! Honk!
        
        Electric Car: Tesla, Color: Blue, Year: 2023
        The Blue Tesla electric car is starting silently.
        The Blue Tesla electric car is accelerating.
        The Blue Tesla electric car is braking.
        The Blue Tesla electric car is charging.
        Honk! Honk! */
    }
}


