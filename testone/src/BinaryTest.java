/*
  二进制 (binary): 0,1 满2进1，以0b或0B开头。
  十进制 (decimal): 0-9 满10进1。
  八进制 (octal): 0-7 满8进1，以0开头。
  十六进制 (hex): 0-9及A-F或a-f 满16进1，以0x或0X开头  。 
    eq: 0x21AF +1 = 0X21B0
*/
public class BinaryTest {
	
	public static void main(String[] arguments) {
		
		int b = 0111;
		int d = 1249;
		int o = 02127;
		int h = 0x32A;
		
		System.out.println("num b: "+ b);// 转十进制   73
		System.out.println("num d: "+ d);// 转十进制   1249
		System.out.println("num o: "+ o);// 转十进制   1111
		System.out.println("num h: "+ h);// 转十进制   810
		
	}
}
