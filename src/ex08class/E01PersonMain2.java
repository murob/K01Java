package ex08class;

class Person2 {
	
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	
	void eat() {
		System.out.printf("%s가 식사를 한다\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s가 잠자고 있다\n", age, name);
	}
}

public class E01PersonMain2 {

	public static void main(String[] args) {
		
		Person2 person = new Person2();
		System.out.println(person.age);
		person.sleep();
	}

}
