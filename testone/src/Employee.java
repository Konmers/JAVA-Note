
public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	// Employee 类的构造器
	public Employee(String name) {
		this.name = name;
	}
	// 设置age的值
	public void empAge(int empAge) {
		age = empAge;
	}
	
	// 设置 designation 的值
	public void empDesignation(String empDesig) {
		designation = empDesig;
	}
	
	// 设置 salary 的值
	public void empSalary(double empSalary) {
		salary = empSalary;
	}
	
	// 打印信息
	public void printEmployee() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("designation: "+designation);
		System.out.println("salary: "+salary);
	}
}