// Writing generalized code

class Vehicle {}

class TwoWheeler extends Vehicle {}

class FourWheeler extends Vehicle {}

class Bike extends TwoWheeler {}

class Car extends FourWheeler {}

class Human {}

public class Main1 {
	
	public static void test(Vehicle v) {
		
	}

	public static void main(String[] args) {
		test(new Vehicle());
		test(new TwoWheeler());
		test(new FourWheeler());
		test(new Bike());
		test(new Car());
		// test(new Human());
	}

}

class Base {
	
	protected Vehicle getVehicle() {
		return null;
	}
	
}

class Derived extends Base {
	
	@Override
	public Bike getVehicle() {
		return null;
	}
	
}



























