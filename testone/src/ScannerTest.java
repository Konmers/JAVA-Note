/*
 * ��ȡ���̲�ͬ���ͱ���              ʹ�� Scanner  ��
 * 
 * ���裺
 * 1.������ import java.util.Scanner;
 * 2.Scanner ��ʵ����
 * 3.����Scanner�����ط���
 * 
 * ע�⣺
 * ��Ҫ���ݵ��õ�Scanner���Ӧ�����ͣ�����ָ������ֵ�����߻ᱨ ��.... InputMismatchException��,��������������ֹ����
 */

 import java.util.Scanner;
 
public class ScannerTest {
	public static void main(String[] arguments) {
		
		//2.Scanner ��ʵ����
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������������� ");
		// 3.����Scanner�����ط���
		String name = scan.next();
		System.out.println(name);
		 
		System.out.println("������������䣺");
		int age = scan.nextInt();
		System.out.println(age);
		 
		System.out.println("������������أ�");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		//����chart ���� Scanner û���ṩ��ط���
		System.out.println("����������Ա� ����/Ů��");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
		
		scan.close();
	}
}
