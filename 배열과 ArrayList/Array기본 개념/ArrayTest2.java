package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		int size = 0;         //선언된 배열은 5개이지만 유효한 0~2까지만 출력하고 싶을 때 size라는 변수를 선언해주고
		num[0] =10.0; size++;
		num[1] =20.0; size++;
		num[2] =30.0; size++;
		
		double total = 1.0;
		for(int i = 0; i<size; i++) {       //length가 아닌 size변수로 범위를 제한
			total *= num[i];               //num.length로 범위 제한 하면 num[3],num[4]가 0으로 출력되어 곱셈 total이 0으로 나옴
		}
		System.out.println("total = " + total);
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
			System.out.println("sum = " + sum);
		
	}

}
