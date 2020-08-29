// Overriding 

class Base {
	
	public void f() {
		System.out.println("f() in Base");
	}
	
	public void g() {
		System.out.println("g() in Base");
	}
}


class Derived extends Base {
	
	// override 
	public void g() {
		System.out.println("g() in Derived");
	}
	
	public void h() {
		System.out.println("h() in Derived");
	}
}
 

public class Main {

	public static void main(String[] args) {
		
		Base b1 = new Base();
		b1.f(); // in Base
		b1.g(); // in Base
		
		System.out.println();
		
		Derived d1 = new Derived();
		d1.f(); // in Base
		d1.g(); // in Derived
		d1.h(); // in Derived
		
		Base b2 = new Derived();
		b2.f(); // in Base
		b2.g(); // in Derived
	}

}
