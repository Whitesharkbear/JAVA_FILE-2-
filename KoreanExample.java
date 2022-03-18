package chapter;

public class KoreanExample {

	public static void main(String[] args) {

		Korean K1 = new Korean("박자바","010231-33132");
		System.out.println(K1.nation);
		System.out.println("K1.name : "+K1.name);
		System.out.println("K1.ssn : "+K1.ssn+"/n");
		

		Korean K2 = new Korean("김자바","13121-33132");
		System.out.println(K2.nation);
		System.out.println("K2.name : "+K2.name);
		System.out.println("K2.ssn : "+K2.ssn);
		
		
		
	}

}
