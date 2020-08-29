
// a + bi; a and b are real numbers e.g. 5 + 4i


class Complex {
	private double real, img;
	
	public Complex() {
		real = img = 0;
	}
	
	public Complex(double r) {
		real = r;
		img = 0;
	}
	
	public Complex(double r, double i) {
		real = r;
		img = i;
	}
	
	
	public void print() {
		System.out.println(real + " +i " + img );
	}
}



public class Main1 {

	public static void main(String[] args) {

		Complex c1, c2, c3;
		
		c1 = new Complex();
		c2 = new Complex(10);
		c3 = new Complex(50, 4);
		
		c1.print();
		c2.print();
		c3.print();
		
	}

}
