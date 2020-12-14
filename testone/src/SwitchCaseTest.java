/*
 * 分支结构
 * switch case
 * switch(条件表达式){
 * 	   case 常量1： 
 *             执行语句/语句块；
 *             break;
 *     case 常量2： 
 *             执行语句/语句块；
 *             break;
 *             .
 *             .
 *             .
 *      default: 
 *      		执行语句/语句块；
 *      break;
 * }
 * 
 * 说明：
 * 1.根据switch表达式值 匹配 case中常量 匹配成功，
 * 		进入执行 里面的语句/语句块 遇到break 跳出switch 否则执行到最后
 * 2. switch 表达式类型  ： 
 *     byte 、short 、char、 int 、枚举类型(JDK5.0 +) 、String(JDK7.0 +)
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
