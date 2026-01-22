import java.util.*;
public class Control2{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		boolean result = true;
		while(result){
			System.out.println("Enter Attendence of The Student:");
			Double Attendence = myobj.nextDouble();
			if (Attendence > 75){
				System.out.println("Eligible for exam");
				if (Attendence > 90)
					System.out.println("Extra 5 marks granted");
			}
			else if (Attendence < 75)
				System.out.println("Not eligible for exam");
			System.out.println("Are there more (true/false)");
			result = myobj.nextBoolean();
		}
	}
}
