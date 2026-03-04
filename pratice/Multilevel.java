class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Mammal extends Animal {
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        myDog.eat();     
        myDog.breathe(); 
        myDog.bark();    
    }
}