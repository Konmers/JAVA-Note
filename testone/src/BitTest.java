/*
 λ�����
 
 1. λ��������������͵�����
 2. << ������1λ���൱�� * 2
 	>> ������1λ���൱�� / 2
 	e q : 2 * 8  ?  2 >> 3  : 8 << 1
*/ 
public class BitTest {
	public static void main(String[] arguments) {
		int i = 21;
		System.out.println("i << 2 ��"+ ( i << 3));
		
		//  ^���
		int a =3 ,b=5;
		a = a  ^ b ;
		System.out.println("a:  "+a); // 6
		b = a ^ b;
		System.out.println("b:  "+b);// 3
		a = a  ^ b ;
		System.out.println("a:  "+a);// 5
	} 
}
