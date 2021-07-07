package loopexample;

public class ForExample {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
		
		int sum1 = 0 ;
		for(num = 1; num <= 10;num++) {
			sum1 += num;
			
		}
		System.out.println(sum1);
		System.out.println(num);
	}
	

}
