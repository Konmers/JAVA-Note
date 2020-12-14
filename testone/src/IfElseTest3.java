/*
 *  练习
 *  由键盘输入三个整数分别存入变量num1, num2, num3
 *  对它们进行排序(使用if-else if-else),并且从小到大输出
 */

import java.util.Scanner;

public class IfElseTest3 {
		public static void main(String[] arguments) {
			Scanner scan = new Scanner(System.in);
			
			
			
			System.out.println("请输入三个变量~");

			System.out.println("第一个变量： ");			
			int num1 = scan.nextInt();
			
			System.out.println("第二个变量： ");
			int num2 = scan.nextInt();
			
			System.out.println("第三个变量： ");
			int num3 = scan.nextInt();
			
			int moddlen1 = ( num1 < num2 ) ?( num1 <num3 ? num1 : num3 ) : ( num2 <num3 ? num2 : num3 );
			int moddlen3 = ( num1 > num2 ) ?( num1 >num3 ? num1 : num3 ) : ( num2 >num3 ? num2 : num3 );
			
			System.out.println("变量1： "+moddlen1+"\n变量3： "+moddlen3);
//			System.out.println("变量1： "+moddlen1+"变量2： "+moddlen2+"变量3： "+moddlen3);
			
		
			scan.close();
		}
}
