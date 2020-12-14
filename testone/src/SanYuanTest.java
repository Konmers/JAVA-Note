/*
 *   三元运算符
 */
public class SanYuanTest {
	public static void main(String[] arguments) {
		 
		// get max
		int m=1,n=3;
		int max =( m >n) ? m : n ;
		System.out.println("max:   "+max);
		
		String maxStr =( m >n) ? "m大" : ((m == n) ? "相等" : "n小" ) ;
		System.out.println("maxStr:   "+maxStr);
	}
}
