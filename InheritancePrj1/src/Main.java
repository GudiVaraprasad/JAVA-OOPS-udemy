// Code reuse

class BasicCalc {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
}

// Inheritance
//                    is a 
class ScientificCalc extends BasicCalc {
	
	public double sin(int deg) {
		double rad = deg * 3.14159 / 180;
		return Math.sin(rad);
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		BasicCalc bcalc1 = new BasicCalc();
		
		System.out.println( bcalc1.add(10, 20));
		System.out.println( bcalc1.sub(10, 20));
		
		// break line
		System.out.println();
		
		ScientificCalc sCalc1 = new ScientificCalc();
		
		System.out.println( sCalc1.add(10, 20));
		System.out.println( sCalc1.sub(10, 20));
		System.out.println( sCalc1.sin(90) );
		
		
		BasicCalc bcalc2 = new ScientificCalc();
		
		System.out.println( bcalc2.add(10, 20));
		System.out.println( bcalc2.sub(10, 20));
		// System.out.println( bcalc2.sin(90));
		System.out.println( ((ScientificCalc)bcalc2).sin(90));
	}

}
