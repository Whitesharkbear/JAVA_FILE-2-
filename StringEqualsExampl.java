package chapter;

public class StringEqualsExampl {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1==strVar2) {
			System.out.println("Var1과 Var2의 참조가 같다");
		}else {
			System.out.println("Var1과 Var2의 참조가 다르다");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("Var1과 Var2의 문자열이 같다");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		if(strVar3==strVar4) {
			System.out.println("Var3과 Var4의 참조가 같다");
		}else {
			System.out.println("Var3과 Var4의 참조가 다르다");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("Var3과 Var4의 문자열이 같다");
		}
	}
	

}
