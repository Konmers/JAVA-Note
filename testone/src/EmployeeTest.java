
/** 
 *�ĵ�ע��
 @author kjkjk
 @version 1.0.0
 *��һ�γ���
 */
public class EmployeeTest {
	/**
	 *ִ�з���
	 */
	public static void main(String[] args) {

		//ʹ�ù��캯�� ������������
		Employee empOne = new Employee("RUNOOB1");
		Employee empTwo = new Employee("RUNOOB2");
		
		// ������������ĳ�Ա����
		empOne.name = empOne.name+"11";
		empOne.empAge(24);
		empOne.empDesignation("da gong ren ");
		empOne.empSalary(1235.2222);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("�������Ա");
		empTwo.empSalary(500);
		empTwo.printEmployee();
		
	}
}
