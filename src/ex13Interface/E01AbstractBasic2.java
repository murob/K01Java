package ex13Interface;

/*
추상클래스1 : 추상메소드를 포함하지 않은 클래스
 */
abstract class AbsClass1 {
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	int instanceVar;
	static int staticVar;
	
	void  instanceMethod() {}
	static void staticMethod() {}
}

class AbsClassChild1 extends AbsClass1 {
	int newVar;
	void newMethod() {}
	
	@Override
	void instanceMethod() {
		System.out.println("필요없다면 오버라이딩 하지 않아도 상관없다.");
	}
}

/*
추상클래스2: 추상메소드를 포함한 클래스
	추상메소드를 멤버로 포함한 클래스는 반드시 abstract로
	선언해야한다. 그렇지 않으면 에러가 발생한다.
 */
abstract class AbsClass2 {
	abstract void absMethod(int number);
}
/*
위의 클래스를 상속하면 부모가 가진 추상메소드를 그대로 상속받게
되므로 해당 클래스도 abstract로 선언해야한다.
단, 이경우에는 객체를 생성할 수 없으므로 부모의 추상메소드를
오버라이딩 하면된다.
 */
class AbsClassChild2 extends AbsClass2 {
	@Override
	void absMethod(int number) {
		System.out.println("부모클래스에서 오버라이딩한 메소드로 없을땐 에러발생함.");
	}
	void newMethod() {
		System.out.println("자식클래스에서 새롭게 확장한 메소드");
	}
}


public class E01AbstractBasic2 {

	public static void main(String[] args) {
		
		//추상클래스는 객체를 생성할 수 없다.
		//AbsClass1 absClass1 = new AbsClass1(); => 에러발생
		
		//추상클래스를 상속한 하위클래스는 객체 생성이 가능하다.
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
	}
		
		
}


