package ex04controlstatement;

public class excersize {

	public static void main(String[] args) {
		
		int dan = 2;
		while(dan<=9) {
			int su = 1;
			while(su<=9) {
				System.out.printf("%d*%d=%d", dan, su, (dan*su));
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
	}

}
