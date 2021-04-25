package common;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//객체의 정보 반환용 메소드
	public String getInfo() {
		return String.format("이름:%s, 나이:%s", name, age);
//		return "이름:"+ name + ", 나이:" +age;
	}
	//객체의 정보 출력용 메소드
	public void showInfo() {
		System.out.println(getInfo());
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		Person person = (Person)obj;
		System.out.println("오버라이딩 한 equals() 호출됨:"+ person.name);
		if(person.name.equals(name)) {
			
			return true;
		}
		return false;
	}
	

}
