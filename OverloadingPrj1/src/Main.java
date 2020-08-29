// Method Overloading

class Sample {
	
	public void print(int a) {
		System.out.println("int - " + a);
	}
	
	public void print(double a) {
		System.out.println("double - " + a);
	}
	
	public void print(String a) {
		System.out.println("string - " + a);
	}
	
}


public class Main {

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.print(10);
		obj.print(10.2);
		obj.print("abc");
	}

}
