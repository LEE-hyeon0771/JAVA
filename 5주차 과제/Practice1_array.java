package practice;
import java.util.Scanner;
public class Practice1_array {

	public static void main(String[] args) {
		double[][] array = new double[3][4];
		Scanner sc = new Scanner(System.in);
		
		double sum=0.0;
		for(int i = 0; i<array.length;i++) {
			for(int j = 0; j<array[i].length;j++) {
				array[i][j] = sc.nextDouble();
				sum += array[i][j];
				
			}
		}
		System.out.println(sum);
	}

}
