package e02variable;

class A1 {
	int a1 = 12;
	static int a2 = 14;
	
}

class B1 {
	void b1() {
		A1 b1 = new A1();
		b1.a1 = 123;
		b1.a2 = 321;
		System.out.println();
	}
}

public class C1 {
	
	public static void main(String[] args) {
	
		A1 a = new A1();
		a.a1 = 1;
		a.a2 = 2;
		
		System.out.println(a.a1 +"   "+a.a2);
		
		A1 b = new A1();
		System.out.println(b.a1+"  "+b.a2);
	}

}
