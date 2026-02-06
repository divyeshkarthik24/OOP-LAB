import java.util.*;

public class Control5 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        boolean result = true;

        do {
            System.out.println("Enter Attendance of The Student:");
            double attendance = myobj.nextDouble();

            if (attendance >= 75) {
                System.out.println("Eligible for exam");
                if (attendance > 90) {
                    System.out.println("Extra 5 marks granted");
                }
            } else {
                System.out.println("Not eligible for exam");
            }

            System.out.println("Are there more? (true/false)");
            result = myobj.nextBoolean();

        } 
        while (result);
        
    }
}