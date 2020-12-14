/*
 * ��֧�ṹ
 * switch case
 * switch(�������ʽ){
 * 	   case ����1�� 
 *             ִ�����/���飻
 *             break;
 *     case ����2�� 
 *             ִ�����/���飻
 *             break;
 *             .
 *             .
 *             .
 *      default: 
 *      		ִ�����/���飻
 *      break;
 * }
 * 
 * ˵����
 * 1.����switch���ʽֵ ƥ�� case�г��� ƥ��ɹ���
 * 		����ִ�� ��������/���� ����break ����switch ����ִ�е����
 * 2. switch ���ʽ����  �� 
 *     byte ��short ��char�� int ��ö������(JDK5.0 +) ��String(JDK7.0 +)
 *  
 */
public class SwitchCaseTest {
	public static void main(String[] arguments) {
		
		// 
		int testVal = 3;
		switch(testVal) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("all");
		}
	}
}
