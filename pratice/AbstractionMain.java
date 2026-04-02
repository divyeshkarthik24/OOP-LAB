
abstract class Vehicle {
 
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

   
    public void startEngine() {
        System.out.println("System Check: All systems go. Engine starting...");
    }
    
    public void displayInfo() {
        System.out.println("Vehicle: " + year + " " + brand);
    }


    abstract void drive();
    abstract void calculateFuelEfficiency();
}


class SportsCar extends Vehicle {
    private boolean turboEnabled;

    public SportsCar(String brand, int year, boolean turboEnabled) {
        super(brand, year);
        this.turboEnabled = turboEnabled;
    }

    
    @Override
    void drive() {
        System.out.println("Driving the sports car quickly on the highway!");
        if (turboEnabled) {
            System.out.println("Turbo boost activated!");
        }
    }

    @Override
    void calculateFuelEfficiency() {
        System.out.println("Fuel Efficiency: 15 MPG (High performance uses more fuel).");
    }
}


class ElectricBike extends Vehicle {
    private int batteryCapacity;

    public ElectricBike(String brand, int year, int batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }


    @Override
    void drive() {
        System.out.println("Riding the e-bike silently through the city.");
    }

    @Override
    void calculateFuelEfficiency() {
        System.out.println("Fuel Efficiency: Infinite! Uses " + batteryCapacity + "kWh battery.");
    }
}

public class AbstractionMain {
    public static void main(String[] args) {
        System.out.println("--- Abstract Class Demo ---");
        
       
        
        SportsCar myFerrari = new SportsCar("Ferrari", 2024, true);
        myFerrari.displayInfo(); // Inherited concrete method
        myFerrari.startEngine(); // Inherited concrete method
        myFerrari.drive();       // Overridden abstract method
        myFerrari.calculateFuelEfficiency();
        
        System.out.println("-------------------------");
        
        ElectricBike myRad = new ElectricBike("RadPower", 2023, 14);
        myRad.displayInfo();
        myRad.startEngine(); 
        myRad.drive();
        myRad.calculateFuelEfficiency();
    }
}