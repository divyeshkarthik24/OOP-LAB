class Calculator{
	public int add(int a, int b){
		return a+b;
	}
	protected int add(int a, int b, int c){
		return a+b+c;
	}
	private double add(double a, double b){
		return a+b;
	}
	public void addition(double a, double b){
		double result = add(a,b);
		System.out.println(result);
	}
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
		int sum1 = calc.add(10, 20);
        System.out.println("Result of 2 integers: " + sum1);
        int sum2 = calc.add(10, 20, 30);
        System.out.println("Result of 3 integers: " + sum2);
        calc.addition(5.5, 4.5); 
    }
}
