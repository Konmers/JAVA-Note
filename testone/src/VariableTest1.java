/*
 强制类型转换：自动类型提升运算的 逆运算
 1.需要使用强转符： ()
 2.注意 强制类型转换，会导致精度损失
*/
public class VariableTest1 {
	public static void main(String[] arguments) {
		double a = 12.1;
		int b = (int)a;  // b 12
		System.out.println("b: "+b);
		
		long c = (long)a;  // c 12
		System.out.println("c: "+c);
		
		float d = (float)a;  // d 12.1
		System.out.println("d: "+d);
	}
}
