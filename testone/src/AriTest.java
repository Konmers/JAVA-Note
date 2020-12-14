/*
	算术运算符
	+(正数) -(负数) +(加) -(减) *(乘) /(除) %(取模)  ++(自增)  --(自减) 
	
*/

public class AriTest {
	public static void main(String[] arguments) {
		
		// 除法
		int num1 = 2;
		int num2 = 3;
		
		int num3 = num1/num2; //0
		System.out.println("num3：  "+num3);
		
		double num4 = num2/num1; //1.0
		System.out.println("num4：  "+num4);
		
		
		// 取模  %
		int b1 = 2;
		int b2 = 3;
		System.out.println("b3：  "+b2 % b1); // 1
		
		// 自增  ++
		//前
		int c = 1;
		System.out.println("c：  "+ c++);// 1
		
		//后
		
		int c1 = 1;
		System.out.println("c1：  "+ ++c1);// 2
		
		
		// 自减  --
		//前
		int d = 5;
		System.out.println("d：  "+ d--);// 5
		
		//后
		
		int d1 = 5;
		System.out.println("c1：  "+ --d1);// 4
	}
}
