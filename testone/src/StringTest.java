
//	String  ���ͱ���
//1.String ����������������,�ַ���
//2.����String������ʹ��һ�� ""
//3.String ���Ժ� 8���������������㣬ֻ��ʱ�������㣺 +
//4.������Ҳʱ string

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
		
		
		//���  * *      ASCll  * = 42   \t = 9
		
		System.out.println("*  *");// *  *
		System.out.println('*' + '\t' + '*'); //93
		System.out.println('*' + "\t" + '*');//* *
		System.out.println('*' + '\t' + "*");//51*
		System.out.println('*' + ('\t' + "*"));//* *
		
	}
}
