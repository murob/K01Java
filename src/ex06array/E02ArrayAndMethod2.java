package ex06array;

public class E02ArrayAndMethod2 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] ref;
		System.out.println("초기화 직후 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		ref = addAllArray(arr, 7);
		
		System.out.println("arr="+ arr);
		System.out.println("ref="+ ref);
		System.out.println("메소드 호출후 출력");
		for(int i=0; i<ref.length; i++) {
			System.out.print(ref[i]+" ");
		}
		
	}
	
	static int[] addAllArray(int[] ar, int addVal) {
		for(int i=0; i<ar.length; i++) {
			ar[i] += addVal;
		}
		return ar;
	}

}
