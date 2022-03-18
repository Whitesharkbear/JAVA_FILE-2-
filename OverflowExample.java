package chapter;

public class OverflowExample {

	public static void main(String[] args) {

		
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		System.out.println(z);
		
		long i = 1000000;
		long j = 1000000;
		long g = i*j;
		System.out.println(g);
	}

}
