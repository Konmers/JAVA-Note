/*
  �߼������
  
  & &&  |  ||  ^
  
  1.������Ϊ boolean����
 
 */
public class logicTest {
	public static void main(String[] arguments) {
	
//		���� & , &&
//		��ͬ��
//		1. & �� && ����������ͬ
//		2.���������Ϊ true,���߶���ִ�з����ұߵ�����
//		��ͬ
//		1.���������Ϊ false,& ����ִ���ұ����㣬&& ��·ԭ�� ֹͣ����
		
		boolean a = true;
		int num1 = 10;
		if(a & (num1++ >0)) {
			System.out.println("one");
		}
		else {
			System.out.println("one");
		}
		
		System.out.println("num1: "+num1);//11
		
		
		boolean b = true;
		int num2 = 10;
		if(b && (num1++ >0)) {
			System.out.println("one");
		}
		else {
			System.out.println("one");
		}
		
		System.out.println("num1: "+num2);//10
		
		
//		���� | , || 
//		��ͬ��
//		1. | �� || ����������ͬ
//		2.���������Ϊ  flase , ���߶���ִ�з����ұߵ�����
//		��ͬ
//		1.���������Ϊ true , | ����ִ���ұ�����  ||  ��·ԭ�� ֹͣ����
		
		boolean a1 = true;
		int num3 = 10;
		if(a1 | (num3++ >0)) {
			System.out.println("one");
		}
		else {
			System.out.println("one");
		}
		
		System.out.println("num1: "+num3);//11
		
		
		boolean b1 = true;
		int num4 = 10;
		if(b1 || (num4++ >0)) {
			System.out.println("one");
		}
		else {
			System.out.println("one");
		}
		
		System.out.println("num1: "+num4);//10
		
	}
}
