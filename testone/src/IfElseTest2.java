/*
 *  ��ϰ
 *  ������ĩ�ɼ�
 *  ���� 100   ��� ����һ�� BMW 
 *  ����80��С�� 99   ��� ����һ̨ iphone xs max 
 *  ����60��С�� 80   ��� ����һ�� Ipad
 *  С��60   ��� ��  ����~~
 */


import java.util.Scanner;

public class IfElseTest2 {
		public static void main(String[] arguments) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("��������ĩ�ɼ�:    ");
			
			double grade = scan.nextDouble();
			
			if ( grade == 100 ) {
				System.out.println("����һ�� BMW ");
			} else if( grade>=80 && grade <=99 ) {
				System.out.println("����һ̨iphone xs max ");
			} else if( grade >= 60 && grade < 80 ) {
				System.out.println("����һ�� Ipad");
			} else {
				System.out.println("��  ����~~");
			}
		
			scan.close();
		}
}
