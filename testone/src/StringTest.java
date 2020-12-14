
//	String  类型变量
//1.String 属于引用数据类型,字符串
//2.申明String变量，使用一对 ""
//3.String 可以和 8种数据类型做运算，只能时连接运算： +
//4.运算结果也时 string

public class StringTest {
	public static void main(String[] arguments) {
		char c ='a';
		int num = 5;
		String str = "hello";
		System.out.println(c + num + str);//102hello
		System.out.println(c + str + num);//ahello5
		System.out.println(c + (num + str));//a5hello
		System.out.println((c + num) + str);//102hello
		System.out.println(str + num + c);//hello5a
		
		
		//结果  * *      ASCll  * = 42   \t = 9
		
		System.out.println("*  *");// *  *
		System.out.println('*' + '\t' + '*'); //93
		System.out.println('*' + "\t" + '*');//* *
		System.out.println('*' + '\t' + "*");//51*
		System.out.println('*' + ('\t' + "*"));//* *
		
	}
}
