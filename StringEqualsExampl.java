package chapter;

public class StringEqualsExampl {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1==strVar2) {
			System.out.println("Var1�� Var2�� ������ ����");
		}else {
			System.out.println("Var1�� Var2�� ������ �ٸ���");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("Var1�� Var2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		if(strVar3==strVar4) {
			System.out.println("Var3�� Var4�� ������ ����");
		}else {
			System.out.println("Var3�� Var4�� ������ �ٸ���");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("Var3�� Var4�� ���ڿ��� ����");
		}
	}
	

}
