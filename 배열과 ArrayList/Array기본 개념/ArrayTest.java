package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[] {0,1,2};     //배열 초기화
		int[] array = new int[3];   //일반적 배열 선언
		
		int[] num = {1,2,3};   //배열 초기화
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);       //일반적 배열 선언의 경우 초기값이 없어서 null (0)으로 초기화됨
		}
		System.out.println(numbers.length);
	}

}
