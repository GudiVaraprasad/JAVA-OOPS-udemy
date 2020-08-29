// Template method pattern.

abstract class SearchAlgo {
	
	public final int search(int a[], int ele) {
		
		for(int i=0; i < a.length; i++) {
			if ( match(a[i], ele) ) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public abstract boolean match(int value1, int value2);
}

class EqualitySearchAlgo extends SearchAlgo {

	@Override
	public boolean match(int value1, int value2) {
		return value1 == value2;
	}
	
}

class InequalitySearchAlgo extends SearchAlgo {
	
	@Override
	public boolean match(int value1, int value2) {
		return value1 != value2;
	}
	
}

public class Main {

	public static void main(String[] args) {
	
		int a[] = {10, 20, 30, 10, 20};
		int ele = 20;
		
		SearchAlgo algo = new EqualitySearchAlgo();
		
		int index = algo.search(a, ele);
		
		if (index == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Found at " + index);
		}
		
	
	}

}
