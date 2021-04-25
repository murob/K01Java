package ex05method;

import java.util.Scanner;

/*
메소드형식4] 매개변수도 있고 반환값도 있는 형식으로
	4가지 형식 중 가장많이 사용되는 형태의 메소드이다. 
 */
public class E05MethodType04_1_1 {

	public static void main(String[] args) {
		
		int sumOfAge = getTotalAge(5);
		System.out.println("입력한 나이의 합:"+ sumOfAge);
	} 

	static int getTotalAge(int personCnt) {
		/*
		시나리오] 인원수를 매개변수로 전달받아 인원수 만큼 나이를
		입력받아 그 나이의 합을 반환하는 메소드를 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int ageSum = 0;
		
		for(int i=1 ; i<=personCnt ; i++) {
			System.out.println(i+"번째 사람의 나이는:");
			int age = sc.nextInt();
			ageSum += age;
		}
		return ageSum;
	}

}
