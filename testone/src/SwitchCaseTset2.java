/*
 * 练习：键盘上输入"month"和"day",要求通过程序输出输入的日期为2020年的一共天数。
 *  eq：  2 month  15号  =  31 +15 天
 */

// 引用 Scanner 包

import java.util.Scanner;// 获取键盘输入值
import java.util.Calendar;//获取日期

public class SwitchCaseTset2 {
	public static void main(String[] arguments) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入月份： ");
		int monthVal = scan.nextInt();
		
		System.out.println("请输入天数：");
		int dayVal = scan.nextInt();
		
		
//		a.set( 2020,2-1,1 );// YYYY m d  注意月是从0开始计数的，所以用实际的月份-1才是你要的月份
		
		int allDay = 0;
		Calendar a = Calendar.getInstance();
		switch(monthVal) {
			case 12:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m1 =a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println( monthVal +"月的天数："+m1);
				monthVal = monthVal-1;
			case 11:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m2 =a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m2);
				monthVal = monthVal-1;
			case 10:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m3=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m3);
				monthVal = monthVal-1;
			case 9:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m4=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m4);
				monthVal = monthVal-1;
			case 8:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m5=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m5);
				monthVal = monthVal-1;
			case 7:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m6=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m6);
				monthVal = monthVal-1;
			case 6:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m7=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m7);
				monthVal = monthVal-1;
			case 5:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m8=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m8);
				monthVal = monthVal-1;
			case 4:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m9=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m9);
				monthVal = monthVal-1;
			case 3:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m10=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m10);
				monthVal = monthVal-1;
			case 2:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m11=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m11);
				monthVal = monthVal-1;
			case 1:
				a.set( 2020,(int)monthVal-1,1 );
				allDay += a.getActualMaximum(Calendar.DAY_OF_MONTH);
				int m12=a.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(monthVal +"月的天数："+m12);
				monthVal = monthVal-1;	
				allDay += dayVal;		
		}
		System.out.println("一共天数："+ allDay);
		
//		请输入月份：
//		10
//		请输入天数：
//		15
//		10月的天数：31
//		9月的天数：30
//		8月的天数：31
//		7月的天数：31
//		6月的天数：30
//		5月的天数：31
//		4月的天数：30
//		3月的天数：31
//		2月的天数：29
//		1月的天数：31
//		一共天数：320
	}
}
