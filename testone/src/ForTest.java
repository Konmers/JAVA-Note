/*
 *  for ѭ��
 *  4��Ҫ��
 *  1.��ʼ������
 *  2.ѭ������
 *  3.ѭ����
 *  4.��������
 *   
 *   for��1 ; 2 ; 4��
 *   {
 *       3
 *   }
 */
public class ForTest {
	public static void main(String[] arguments) {
//			int num = 1;
//			for( System.out.print('a');num <= 3; System.out.print('c'),num++) {
//				System.out.print('b');
//			}
			//��� abcbcbc
			
			// ��ϰ  
		    //��1ѭ����150,
//			����ÿ�д�ӡһ��ֵ,
//			������ÿ��3�ı������ϴ�ӡ��"foo",
//			��ÿ��5�ı������ϴ�ӡ"biz,"
//		    ��ÿ��7�ı������ϴ�ӡ���"baz".
			for(int i =1;i<=150;i++) {
				if(i%3 == 0 && i%5 == 0 && i%7 == 0 ) {
					System.out.println(i+" foo biz baz ");
				} else if(i%3 == 0) {
					System.out.println(i+" foo");
				} else if(i%5 == 0) {
					System.out.println(i+" biz");
				} else if(i%7 == 0) {
					System.out.println(i+" baz");
				} else {
					System.out.println(i);
				}
					
			}
	}
}
