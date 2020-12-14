/*
 *  练习
 *  输入期末成绩
 *  等于 100   输出 奖励一辆 BMW 
 *  大于80且小于 99   输出 奖励一台 iphone xs max 
 *  大于60且小于 80   输出 奖励一个 Ipad
 *  小于60   输出 你  不配~~
 */


import java.util.Scanner;

public class IfElseTest2 {
		public static void main(String[] arguments) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("请输入期末成绩:    ");
			
			double grade = scan.nextDouble();
			
			if ( grade == 100 ) {
				System.out.println("奖励一辆 BMW ");
			} else if( grade>=80 && grade <=99 ) {
				System.out.println("奖励一台iphone xs max ");
			} else if( grade >= 60 && grade < 80 ) {
				System.out.println("奖励一个 Ipad");
			} else {
				System.out.println("你  不配~~");
			}
		
			scan.close();
		}
}
