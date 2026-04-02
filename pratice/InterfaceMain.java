
interface Swimmable {
  
    void swim();
    
  
    default void holdBreath() {
        System.out.println("Holding breath underwater for 30 seconds.");
    }
}


interface Flyable {
    void fly();
    
   
    static void checkWindSpeed() {
        System.out.println("Checking wind speed... Wind is optimal for flying.");
    }
}


interface Walkable {
    void walk();
}


class SuperDuck implements Swimmable, Flyable, Walkable {
    private String name;

    public SuperDuck(String name) {
        this.name = name;
    }

 
    @Override
    public void walk() {
        System.out.println(name + " the duck is waddling on the ground.");
    }

  
    @Override
    public void swim() {
        System.out.println(name + " the duck is paddling in the pond.");
    }


    @Override
    public void fly() {
        System.out.println(name + " the duck is soaring through the sky!");
    }
    
        @Override
    public void holdBreath() {
        System.out.println(name + " is a super duck and holds breath for 5 minutes!");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        System.out.println("--- Interface Demo ---");
        
        SuperDuck daffy = new SuperDuck("Daffy");
        
 
        daffy.walk();
        daffy.swim();
        
        
        daffy.holdBreath(); 
        
        
        Flyable.checkWindSpeed();
        daffy.fly();
    }
}