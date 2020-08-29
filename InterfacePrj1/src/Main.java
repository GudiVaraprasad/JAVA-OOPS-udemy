// Interface

interface Calc {
	
	double PI = 3.14159; // public static final 
						 // Calc.PI
	
	double add(double a, double b);
	double sub(double a, double b); // public abstract 
}

class MyCalc implements Calc {

	@Override
	public double add(double a, double b) {
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		return a - b;
	}
	
	public double sin(double deg) {
		double radians = deg * 3.14159 / 180;
		return Math.sin(radians);
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		MyCalc obj = new MyCalc();
		
		System.out.println( obj.add(10, 20) );
		System.out.println( obj.sub(10, 20) );
		System.out.println( obj.sin(90) );
		
		Calc c;
		
		c = new MyCalc();

		System.out.println( c.add(10, 20) );
		System.out.println( c.sub(10, 20) );
		// System.out.println( c.sin(90) );
		
	}

}
