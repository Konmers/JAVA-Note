
public class VariableTest {
	public static void main(String[] arguments) {
		
		// �Զ���������----------------------------------
		// byte�� char��short -> int -> long -> float -> double ->string
		// ����ֵ������ ���ֽ�����ľ���
		// byte\char\short �������ͼ��� �������ʱ int 
		
		byte a = 1;
		int b = 12;
//		byte �� int ���� ��int ����Ϊ׼
//		byte c = a + b;
		int c = a + b;// c 13
		System.out.println("c: "+c);
		
		long c1 = a + b;// c1 13
		System.out.println("c1: "+c1);
		
		float c2 = a + b;// c2 13.0
		System.out.println("c2: "+c2);
		
		// end-----------------------
		
	}
}
