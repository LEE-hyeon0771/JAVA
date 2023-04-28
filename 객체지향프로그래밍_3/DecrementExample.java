
public class DecrementExample {
	
	public static int decrement(int n) {
		n = n - 1;
		return n;
	}
	
	public static void decrementArray(int [] list) {
		for(int i = 0; i < list.length; i++) {
			list[i] = list[i] - 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		decrement(n);  //9
		System.out.println(n); //10
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		
		decrementArray(arr);   // 9 10 11
		
		for(int element : arr) {
			System.out.println(element);
			//9
			//10
			//11
		}
	}

}
