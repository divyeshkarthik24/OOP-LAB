class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle: πr²");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Area of Square: s²");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();

        c.display(); 
        c.area();    

        s.display(); 
        s.area();    
    }
}