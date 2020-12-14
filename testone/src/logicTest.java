/*
  逻辑运算符
  
  & &&  |  ||  ^
  
  1.运算结果为 boolean类型
 
 */
public class logicTest {
	public static void main(String[] arguments) {
	
//		区分 & , &&
//		相同点
//		1. & 与 && 的运算结果相同
//		2.当符号左边为 true,二者都会执行符号右边的运算
//		不同
//		1.当符号左边为 false,& 继续执行右边运算，&& 短路原则 停止运算
		
		boolean a = true;
		int num1 = 10;
		if(a & (num1++ >0)) {
			System.out.println("one");
		}
		else {
			System.out.println("one");
		}
		
		System.out.println("num1: "+num1);//11
		
		
		boolean b = true;
		int num2 = 10;
		if(b && (num1++ >0)) {
			System.out.println("one");
		}
		else {
			System.out.println("one");
		}
		
		System.out.println("num1: "+num2);//10
		
		
//		区分 | , || 
//		相同点
//		1. | 与 || 的运算结果相同
//		2.当符号左边为  flase , 二者都会执行符号右边的运算
//		不同
//		1.当符号左边为 true , | 继续执行右边运算  ||  短路原则 停止运算
		
		boolean a1 = true;
		int num3 = 10;
		if(a1 | (num3++ >0)) {
			System.out.println("one");
		}
		else {
			System.out.println("one");
		}
		
		System.out.println("num1: "+num3);//11
		
		
		boolean b1 = true;
		int num4 = 10;
		if(b1 || (num4++ >0)) {
			System.out.println("one");
		}
		else {
			System.out.println("one");
		}
		
		System.out.println("num1: "+num4);//10
		
	}
}
