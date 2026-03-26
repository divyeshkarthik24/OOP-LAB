// Base Class
class Calculator {

    // 1. Public method to perform addition
    public int add(int a, int b) {
        System.out.println("Calculator: Adding two integers normally.");
        return a + b;
    }

    // 2. Protected method to show a message
    protected void display() {
        System.out.println("Calculator: Displaying standard message.");
    }

    // 3. Private method (cannot be inherited or overridden)
    private void show() {
        System.out.println("Calculator: This is a private show() method.");
    }

    // 4. Public method to access the private method
    public void accessPrivate() {
        System.out.print("Accessing private method from inside Calculator -> ");
        show();
    }
}

// Derived Class
class AdvancedCalculator extends Calculator {

    // Overriding the public add() method
    @Override
    public int add(int a, int b) {
        System.out.println("AdvancedCalculator: Adding integers with advanced logging.");
        return a + b; 
    }

    // Overriding the protected display() method
    @Override
    protected void display() {
        System.out.println("AdvancedCalculator: Displaying advanced message.");
    }

    // Defining its own show() method
    // NOTE: This does NOT override Calculator.show() because the parent's method is private.
    public void show() {
        System.out.println("AdvancedCalculator: This is a completely new show() method.");
    }
}

// Main Program
public class Q2 {
    public static void main(String[] args) {

        System.out.println("--- 1. Base Class Object ---");
        Calculator baseCalc = new Calculator();
        baseCalc.add(10, 5);
        baseCalc.display();
        baseCalc.accessPrivate();

        System.out.println("\n--- 2. Derived Class Object ---");
        AdvancedCalculator advCalc = new AdvancedCalculator();
        advCalc.add(10, 5);
        advCalc.display();
        advCalc.show(); // Calls its own new show() method
        advCalc.accessPrivate(); // Inherited method, which internally calls Calculator's private show()

        System.out.println("\n--- 3. Runtime Polymorphism (Parent Reference -> Child Object) ---");
        Calculator polyCalc = new AdvancedCalculator();
        
        // The compiler sees polyCalc as a 'Calculator', but at RUNTIME, 
        // the JVM knows it's actually an 'AdvancedCalculator'.
        
        polyCalc.add(10, 5);      // Dynamically calls AdvancedCalculator's add()
        polyCalc.display();       // Dynamically calls AdvancedCalculator's display()
        
        // polyCalc.show();       // Compile Error! The compiler checks the Calculator class, and show() is private.
        
        polyCalc.accessPrivate(); // Calls inherited method, which triggers Calculator's private show()
    }
}