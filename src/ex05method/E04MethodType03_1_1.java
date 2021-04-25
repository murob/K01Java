package ex05method;

import java.util.Scanner;
/*
메소드형태3] 매개변수는 있으나 반환값이 없는 경우
	: 값을 전달받은후 연산하고 해당 결과를 즉시 출력하는
	경우에 주로 사용된다. 
 */
public class E04MethodType03_1_1 {

	/*
	시나리오] 사용자가 입력한 2개의 시작값과 끝값사이에 있는
	수를 모두 더하여 출력하는 프로그램을 작성하시오.
		출력결과]
			시작값 : 5
			종료값 : 9
			결과 : 5+6+7+8+9=???
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 값을 입력하시오: ");
		int s = sc.nextInt();
		System.out.print("종료 값을 입력하시오: ");
		int e = sc.nextInt();
		plus1(s, e);
	}
	
	public static void plus1(int sNum, int eNum) {
		int sum=0;
		for(int i=sNum ; i<=eNum ; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의 합은 %d", sNum, eNum, sum);
	}
}
