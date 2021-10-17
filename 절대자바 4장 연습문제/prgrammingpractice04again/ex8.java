package prgrammingpractice04again;

public class ex8 {

	public static void main(String[] args) {
		int ary[][] = {{78,48,78,98},{99,92},{29,64,83},{34,78,92,56}};
		int sum = 0;
		double avg = 0;
		for(int i = 0; i<ary.length; i++) {
			for(int j = 0; j<ary[i].length; j++) {
				sum += ary[i][j]; //sum=0에 ary[i][j]모두 더하기 가능
			}
			avg = sum/ary[i].length;  // 0,1,2,3행 모두 출력가능
		}
		
		System.out.println("합은 " + sum);
		System.out.println("평균은 " + avg);
	}

}
