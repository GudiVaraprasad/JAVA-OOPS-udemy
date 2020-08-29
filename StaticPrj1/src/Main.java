
class MyMath {
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}
	
}

class Sample {
	int value;
	
	public void set(int x) {
		value = x;
	}
	
	public int get() {
		return value;
	}
}

public class Main {

	public static void main(String[] args) {
		
		int a = MyMath.add(10, 20);
		int b = MyMath.sub(5, 2);
		
		System.out.println(a);
		System.out.println(b);
		
		
		Sample obj1 = new Sample();
		obj1.set(10);
		System.out.println( obj1.get() );
		
		
	}

}
