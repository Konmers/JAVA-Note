/*
 * ��ϰ������������"month"��"day",Ҫ��ͨ������������������Ϊ2020���һ��������
 *  eq��  2 month  15��  =  31 +15 ��
 */

// ���� Scanner ��

import java.util.Scanner;// ��ȡ��������ֵ
import java.util.Calendar;//��ȡ����

public class SwitchCaseTset2 {
	public static void main(String[] arguments) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������·ݣ� ");
		int monthVal = scan.nextInt();
		
		System.out.println("������������");
		int dayVal = scan.nextInt();
		
		
//		a.set( 2020,2-1,1 );// YYYY m d  ע�����Ǵ�0��ʼ�����ģ�������ʵ�ʵ��·�-1������Ҫ���·�
		
		int allDay = 0;
		Calendar a = Calendar.getInstance();
		switch(monthVal) {
			case 12:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m1 =a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println( monthVal +"�µ�������"+m1);
				monthVal = monthVal-1;
			case 11:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m2 =a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m2);
				monthVal = monthVal-1;
			case 10:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m3=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m3);
				monthVal = monthVal-1;
			case 9:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m4=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m4);
				monthVal = monthVal-1;
			case 8:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m5=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m5);
				monthVal = monthVal-1;
			case 7:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m6=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m6);
				monthVal = monthVal-1;
			case 6:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m7=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m7);
				monthVal = monthVal-1;
			case 5:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m8=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m8);
				monthVal = monthVal-1;
			case 4:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m9=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m9);
				monthVal = monthVal-1;
			case 3:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m10=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m10);
				monthVal = monthVal-1;
			case 2:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m11=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m11);
				monthVal = monthVal-1;
			case 1:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m12=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"�µ�������"+m12);
				monthVal = monthVal-1;	
				allDay += dayVal;		
		}
		System.out.println("һ��������"+ allDay);
		
//		�������·ݣ�
//		10
//		������������
//		15
//		10�µ�������31
//		9�µ�������30
//		8�µ�������31
//		7�µ�������31
//		6�µ�������30
//		5�µ�������31
//		4�µ�������30
//		3�µ�������31
//		2�µ�������29
//		1�µ�������31
//		һ��������320
	}
}
