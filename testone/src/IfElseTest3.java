/*
 *  ��ϰ
 *  �ɼ����������������ֱ�������num1, num2, num3
 *  �����ǽ�������(ʹ��if-else if-else),���Ҵ�С�������
 */

import java.util.Scanner;

public class IfElseTest3 {
		public static void main(String[] arguments) {
			Scanner scan = new Scanner(System.in);
			
			
			
			System.out.println("��������������~");

			System.out.println("��һ�������� ");			
			int num1 = scan.nextInt();
			
			System.out.println("�ڶ��������� ");
			int num2 = scan.nextInt();
			
			System.out.println("������������ ");
			int num3 = scan.nextInt();
			
			int moddlen1 = ( num1 < num2 ) ?( num1 <num3 ? num1 : num3 ) : ( num2 <num3 ? num2 : num3 );
			int moddlen3 = ( num1 > num2 ) ?( num1 >num3 ? num1 : num3 ) : ( num2 >num3 ? num2 : num3 );
			
			System.out.println("����1�� "+moddlen1+"\n����3�� "+moddlen3);
//			System.out.println("����1�� "+moddlen1+"����2�� "+moddlen2+"����3�� "+moddlen3);
			
		
			scan.close();
		}
}
