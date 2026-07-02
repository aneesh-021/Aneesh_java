package training.oops;

public class Smartphone {
    String brand;
    String model;
    int storage;

    // 1. Non-parameterized Constructor
    public Smartphone() {
        this.brand = "Unknown";
        this.model = "Generic";
        this.storage = 128;
        System.out.println("No parameterized Constructor called");
    }

    // 2. Parameterized Constructor (3 parameters)
    public Smartphone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        System.out.println("Parameterized Constructor called");
    }

    // 3. Overloaded Constructor (2 parameters) - Moved inside the class
    public Smartphone(String brand, String model) {
        this(brand, model, 256); // Calls the 3-parameter constructor
        System.out.println("Overloaded parameterized constructor called");
    }

    public void display() {
        System.out.println("Specs: " + brand + " " + model + " " + storage + "GB \n");
    }
}

// Removed 'public' so it can exist in the same file as Smartphone
class constructors {
    public static void main(String[] args) {
        System.out.println("=== object creation ===");
        
        System.out.println("Non parameterized:");
        Smartphone s1 = new Smartphone();
        s1.display();

        System.out.println("Parameterized (3 arguments):");
        Smartphone s2 = new Smartphone("Samsung", "Galaxy S26", 512);
        s2.display();

        System.out.println("Overloaded (2 arguments):");
        Smartphone s3 = new Smartphone("VIVO", "V40");
        s3.display(); 
    }
}