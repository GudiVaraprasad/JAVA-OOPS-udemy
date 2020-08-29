// Initializers

class Sample {
	
	static {
		// static initilizer
		System.out.println("static initializer");
	}
	
	{
		// non - static initializer
		System.out.println("non static initializer");
	}
	
}


class SomeConfigurationProvider {
	
	// properties
	
	static {
		// load the properties
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();

	}

}
