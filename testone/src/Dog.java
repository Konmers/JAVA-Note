public class Dog {
	int puppyAge;
	//name
	public Dog(String name) {
		System.out.println("dog name: "+name);
	}
	
	//age
	public void setAge(int age) {
		puppyAge = age;
		System.out.println("dog have old: "+puppyAge);
	}
	
	public static void main(String[] args) {
		Dog myPuppy = new Dog(" tom ");
		myPuppy.setAge(2);
	}
}

