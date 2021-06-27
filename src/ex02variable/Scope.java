package e02variable;

class Qwer {
	int a = 10;
	public void bcc() {
		int a = 12;
		System.out.println(a);
		System.out.println(this.a);
	}
}

public class Scope {	
	
	public static void main(String[] args) {
		Qwer q = new Qwer();
		
		q.bcc();
		
	}

}
