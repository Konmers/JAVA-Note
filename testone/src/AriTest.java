/*
	���������
	+(����) -(����) +(��) -(��) *(��) /(��) %(ȡģ)  ++(����)  --(�Լ�) 
	
*/

public class AriTest {
	public static void main(String[] arguments) {
		
		// ����
		int num1 = 2;
		int num2 = 3;
		
		int num3 = num1/num2; //0
		System.out.println("num3��  "+num3);
		
		double num4 = num2/num1; //1.0
		System.out.println("num4��  "+num4);
		
		
		// ȡģ  %
		int b1 = 2;
		int b2 = 3;
		System.out.println("b3��  "+b2 % b1); // 1
		
		// ����  ++
		//ǰ
		int c = 1;
		System.out.println("c��  "+ c++);// 1
		
		//��
		
		int c1 = 1;
		System.out.println("c1��  "+ ++c1);// 2
		
		
		// �Լ�  --
		//ǰ
		int d = 5;
		System.out.println("d��  "+ d--);// 5
		
		//��
		
		int d1 = 5;
		System.out.println("c1��  "+ --d1);// 4
	}
}
