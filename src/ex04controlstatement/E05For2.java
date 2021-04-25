package ex04controlstatement;
/*
for 문 : while문과 같은 반복문으로 초기값, 조건식, 증감식이 한 줄에 있어 반복의 횟수를 명시적으로
알 수 있는 반복문이다. 그러므로 사용빈도가 가장 높다.
형식]
	for(초기값 ; 조건식 ; 증감식) {
		실행문;
	}
	
	실행순서]
		초기값 -> 조건식 확인 -> 참일 때 실행 -> 증감식
		-> 조건식 확인 -> 반복실행
		->
 */

public class E05For2 {

	public static void main(String[] args) {
		
		/*
		for문의 실행순서
		1. 반복을 위한 변수 i를 1로 초기화
		2. 조건을 검사(i가 5이하이면)
		3. 참일 때 실행문을 실행한다.
		4. 증가(감소)식 실행
		5. 조건을 검사(3,4,5번을 반복 횟 수만큼 실행)
		6. 조건이 false가 되면 탈출
		 */
//		for(int i=1 ; i<=5 ; i++) {
//			System.out.println("i="+ i);
//		}
		
		/*
		시나리오] 1~100까지의 합을 구하는 프로그램을 for문을 이용하여 구현하시오.
		 */
		
		int total=0;
		for(int a=1 ; a<=100 ; a++) {
			total += a;
		}
		System.out.println("1~100까지의 합:"+ total);
		
		/*
		시나리오] for문을 이용하여 1~10사이의 정수중 2의배수의 합을 구하는 프로그램을 작성하시오.
		 */
		
		int plus = 0;
		for(int j=1 ; j<=10 ; j++) {
			if(j%2==0) {
				System.out.println("j의값:"+j);
				plus += j;
			}
		}
		System.out.println("1~10사이의 정수 값중 2의배수의 합:"+plus);
		
		int i=0;
		for( ; i<=5 ; i++) {
			System.out.println("for문 안에서의 i값="+ i);
		}
		System.out.println("for문 밖에서의 i값="+ i);
	}

}
