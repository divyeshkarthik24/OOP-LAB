import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Grade (A, B, C, D, or F):");
        char grade = scanner.next().charAt(0); 

        switch (grade) {
            case 'A':
                System.out.println("Excellent! Keep it up.");
                break;
            case 'B':
                System.out.println("Great job!");
                break;
            case 'C':
                System.out.println("Good effort.");
                break;
            case 'D':
                System.out.println("You passed, but try harder next time.");
                break;
            case 'F':
                System.out.println("Failed. You need to retake the exam.");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }
        
    }
}