package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[] {0,1,2};     //�迭 �ʱ�ȭ
		int[] array = new int[3];   //�Ϲ��� �迭 ����
		
		int[] num = {1,2,3};   //�迭 �ʱ�ȭ
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);       //�Ϲ��� �迭 ������ ��� �ʱⰪ�� ��� null (0)���� �ʱ�ȭ��
		}
		System.out.println(numbers.length);
	}

}
