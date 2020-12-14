/*
  ������ (binary): 0,1 ��2��1����0b��0B��ͷ��
  ʮ���� (decimal): 0-9 ��10��1��
  �˽��� (octal): 0-7 ��8��1����0��ͷ��
  ʮ������ (hex): 0-9��A-F��a-f ��16��1����0x��0X��ͷ  �� 
    eq: 0x21AF +1 = 0X21B0
*/
public class BinaryTest {
	
	public static void main(String[] arguments) {
		
		int b = 0111;
		int d = 1249;
		int o = 02127;
		int h = 0x32A;
		
		System.out.println("num b: "+ b);// תʮ����   73
		System.out.println("num d: "+ d);// תʮ����   1249
		System.out.println("num o: "+ o);// תʮ����   1111
		System.out.println("num h: "+ h);// תʮ����   810
		
	}
}
