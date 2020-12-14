/*
 * 获取键盘不同类型变量              使用 Scanner  类
 * 
 * 步骤：
 * 1.导包： import java.util.Scanner;
 * 2.Scanner 的实例化
 * 3.调用Scanner类的相关方法
 * 
 * 注意：
 * 需要根据调用的Scanner类对应的类型，输入指定类型值；否者会报 ”.... InputMismatchException“,输入类型有误并终止程序
 */

 import java.util.Scanner;
 
public class ScannerTest {
	public static void main(String[] arguments) {
		
		//2.Scanner 的实例化
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入你的姓名： ");
		// 3.调用Scanner类的相关方法
		String name = scan.next();
		System.out.println(name);
		 
		System.out.println("请输入你的年龄：");
		int age = scan.nextInt();
		System.out.println(age);
		 
		System.out.println("请输入你的体重：");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		//对于chart 类型 Scanner 没有提供相关方法
		System.out.println("请输入你的性别： （男/女）");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
		
		scan.close();
	}
}
