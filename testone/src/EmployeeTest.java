
/** 
 *文档注释
 @author kjkjk
 @version 1.0.0
 *第一次尝试
 */
public class EmployeeTest {
	/**
	 *执行方法
	 */
	public static void main(String[] args) {

		//使用构造函数 创建两个对象
		Employee empOne = new Employee("RUNOOB1");
		Employee empTwo = new Employee("RUNOOB2");
		
		// 调用两个对象的成员方法
		empOne.name = empOne.name+"11";
		empOne.empAge(24);
		empOne.empDesignation("da gong ren ");
		empOne.empSalary(1235.2222);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("菜鸟程序员");
		empTwo.empSalary(500);
		empTwo.printEmployee();
		
	}
}
