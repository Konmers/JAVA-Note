
public class VariableTest {
	public static void main(String[] arguments) {
		
		// 自动类型提升----------------------------------
		// byte、 char、short -> int -> long -> float -> double ->string
		// 计算值的类型 由字节数大的决定
		// byte\char\short 三种类型计算 结果必须时 int 
		
		byte a = 1;
		int b = 12;
//		byte 与 int 计算 以int 类型为准
//		byte c = a + b;
		int c = a + b;// c 13
		System.out.println("c: "+c);
		
		long c1 = a + b;// c1 13
		System.out.println("c1: "+c1);
		
		float c2 = a + b;// c2 13.0
		System.out.println("c2: "+c2);
		
		// end-----------------------
		
	}
}
