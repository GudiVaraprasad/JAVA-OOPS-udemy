
// this keyword
// ----

class Sample {
	
	private int value;
	
	public Sample() {
		this(10);
		// logic with defaults
	}
	
	public Sample(int n) {
		// logic with n
	}
	
	public void set(int value) {
		this.value = value;
	}
	
	public void print() {
		System.out.println(this.value);
	}
	
}




public class Main {

	public static void main(String[] args) {
		
		Sample s1, s2;
		
		s1 = new Sample();
		s2 = new Sample();
		
		s1.set(10);
		s2.set(20);
		
		s1.print();
		s2.print();
		
	}

}
