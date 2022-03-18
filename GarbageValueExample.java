package chapter;

public class GarbageValueExample {

	public static void main(String[] args) {

		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0; i<5; i++) {
			var1++;
			
			System.out.println("var1:"+var1+"var2:"+var2);
		}
		for(int j = 0; j<10; j++) {
		var2+=2;
		System.out.println("var2:"+var2);
		}
		
		
	}

}
