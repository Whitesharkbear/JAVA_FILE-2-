package chapter;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {

		int i = 127;
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			System.out.println("byteŸ������ ��ȯ�� �� ����.");
			System.out.println("���� �ٽ� Ȯ���ϼ���.");
		}
		else {
			byte b = (byte)i;
			System.out.println(b);
		}
		
		
	}

}
