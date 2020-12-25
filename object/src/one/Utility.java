package one;

//��װ ������㷽��
import java.util.Scanner;

public class Utility {
	private static Scanner scanner =new Scanner(System.in);
	
	//��������ֵ��װ
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
//			System.out.println("����������λ�����󣡣���");
//		}
		return vals;
	}
	
	// ѡ��˵�
	public static char readMenuSelection() {
		char c;
		for( ; ; ) {
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if( c != '1' && c != '2' && c != '3' && c != '4'  ) {
				System.out.println("ѡ����ˣ�����ѡ��  ");
			} else break;
		}
		return c;
	}

	//��¼ ������ 
	public static int readNumber() {
		int n;
		for( ; ; ) {
			String str = readKeyBoard(4);
			try {
				n = Integer.parseInt(str);
				break;
			} catch ( NumberFormatException e ) {
				 System.out.print("������������� �������룺  ");
			}
		}
		return n;
	}
	
	//˵��
	public static String readString() {
		String str = readKeyBoard(8);
//		for( ; ; ) {
//			str = readKeyBoard(8);
//			if( str.length()<=0) {
//				System.out.println("˵��Ϊ�գ�����");
//			} else break;
//		}
			return str;		
	}
	
	//�˳�
	public static char readExit() {
		char exit;
		for( ; ; ) {
			String str = readKeyBoard(2).toUpperCase();
			exit = str.charAt(0);
			if( exit =='Y' || exit =='N') {
				break;
			} else {
				System.out.println("����������������룺 ");
			}
		}
		return exit;	
	}
}
