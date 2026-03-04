class Employee {
    String company;

    Employee() {
        this("Generic Corp");
    }

    Employee(String company) {
        this.company = company;
    }
}

class Developer extends Employee {
    String language;

    Developer() {
        super("Tech Solutions");
        this.language = "Java";
    }

    Developer(String language) {
        this();
        this.language = language;
    }

    void display() {
        System.out.println("Company: " + company + ", Language: " + language);
    }
}

public class ChainingDemo {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        Developer dev2 = new Developer("Python");

        dev1.display();
        dev2.display();
    }
}