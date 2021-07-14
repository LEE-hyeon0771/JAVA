package array;

public class TowDimensionArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		for(int i =0;i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		char[][] alphabets = new char[13][2];
		char ch = 'a';
		for(int i = 0; i<alphabets.length;i++) {
			for(int j = 0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch++;
				System.out.print(alphabets[i][j]);
			}
			System.out.println();
		}
	}

}
