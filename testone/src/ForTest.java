/*
 *  for 循环
 *  4个要素
 *  1.初始化条件
 *  2.循环条件
 *  3.循环体
 *  4.迭代条件
 *   
 *   for（1 ; 2 ; 4）
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
			//结果 abcbcbc
			
			// 练习  
		    //从1循环到150,
//			并在每行打印一个值,
//			另外在每个3的倍数行上打印出"foo",
//			在每个5的倍数行上打印"biz,"
//		    在每个7的倍数行上打印输出"baz".
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
