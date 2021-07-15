package Q3;

public class ArrayTotal {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,4,6,8,10};
		
		int total = 0;
		for(int i = 0; i<arr.length;i++) {
			total += arr[i]; 
		}
		System.out.println("Â¦¼öÀÇ ÇÕÀº" + total);
	}

}
