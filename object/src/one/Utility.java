package one;

//封装 输入计算方法
import java.util.Scanner;

public class Utility {
	private static Scanner scanner =new Scanner(System.in);
	
	//键盘输入值封装
	private static String readKeyBoard( int val ) {
		String vals="";
		switch( val ){
			case 1:
				vals = scanner.next();
				break;
			case 2:
				vals = scanner.next();
				break;
			case 4:
				vals = scanner.next();
				break;
			case 8:
				vals = scanner.next();
				break;
		}
//		System.out.println("vals--------  "+vals);
//		System.out.println("vals.length()--------  "+vals.length());
//		if(vals.length() > val ) {
//			System.out.println("报错！你输入位数有误！！！");
//		}
		return vals;
	}
	
	// 选择菜单
	public static char readMenuSelection() {
		char c;
		for( ; ; ) {
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if( c != '1' && c != '2' && c != '3' && c != '4'  ) {
				System.out.println("选择错了，重新选择：  ");
			} else break;
		}
		return c;
	}

	//记录 收入金额 
	public static int readNumber() {
		int n;
		for( ; ; ) {
			String str = readKeyBoard(4);
			try {
				n = Integer.parseInt(str);
				break;
			} catch ( NumberFormatException e ) {
				 System.out.print("数字输入错误，请 重新输入：  ");
			}
		}
		return n;
	}
	
	//说明
	public static String readString() {
		String str = readKeyBoard(8);
//		for( ; ; ) {
//			str = readKeyBoard(8);
//			if( str.length()<=0) {
//				System.out.println("说明为空！！！");
//			} else break;
//		}
			return str;		
	}
	
	//退出
	public static char readExit() {
		char exit;
		for( ; ; ) {
			String str = readKeyBoard(2).toUpperCase();
			exit = str.charAt(0);
			if( exit =='Y' || exit =='N') {
				break;
			} else {
				System.out.println("输入错误，请重新输入： ");
			}
		}
		return exit;	
	}
}
