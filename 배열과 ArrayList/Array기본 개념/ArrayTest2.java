package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		int size = 0;         //����� �迭�� 5�������� ��ȿ�� 0~2������ ����ϰ� ���� �� size��� ������ �������ְ�
		num[0] =10.0; size++;
		num[1] =20.0; size++;
		num[2] =30.0; size++;
		
		double total = 1.0;
		for(int i = 0; i<size; i++) {       //length�� �ƴ� size������ ������ ����
			total *= num[i];               //num.length�� ���� ���� �ϸ� num[3],num[4]�� 0���� ��µǾ� ���� total�� 0���� ����
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
