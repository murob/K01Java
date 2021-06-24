package ex12inheritance;

class Women {
	//멤버변수 선언
	private String name;
	
	//Women클래스의 기본생성자
	public Women() {
		System.out.println("Women클래스의 기본생성자 호출");
	}
	
	//Women클래스의 인자생성자
	public Women(String name) {
		this.name = name;
	}
	
	//Women클래스의 멤버메소드
	public void tellYourName() {
		System.out.println("내이름은 "+ name +"입니다.");
	}
}

//Women(부모클래스)의 상속을 받는 BusinessWomen(자식클래스)
class BusinessWomen extends Women {
	
	//BusWomen의 멤버변수선언
	private String company;
	private String position;
	
	/*
	자식클래스의 인자생성자 => 부모클래스의 생성자를 먼저 호출하여 부모객체가
		먼저 생성되도록 해야한다. super()는 부모클래스의 생성자를 호출하는 역할
		super()를 기술하지 않을경우 디폴트 생성자가 호출된다.
	*/
	public BusinessWomen(String name, String company, String position) {
		super(name);
		
		this.company = company;
		this.position = position;
	}
	
	//BusWomen의 멤버메소드선언
	public void tellYourInfo() {
		System.out.print("회사명은 "+ company +"입니다.");
		System.out.print("직급은 "+ position +"입니다.");
		//부모클래스의 멤버메소드 호출. 상속받았으므로 호출 가능함
		tellYourName();
	}
	
}

public class E01BusinessManMain2 {
	/*
	자식 클래스를 통해 객체를 생성하지만, 실행결과에는 부모클래스의 생성자가 먼저 호출된다.
	항상 부모객체가 먼저 생성된 후 자식객체가 생성된다.
	 */
	public static void main(String[] args) {
		BusinessWomen women1 = new BusinessWomen("김천국", "네이버", "대리");
		BusinessWomen women2 = new BusinessWomen("김가네", "카카오", "부장");
		
		women1.tellYourInfo();
		women1.tellYourName();

		women2.tellYourInfo();
		women2.tellYourName();
	}
}