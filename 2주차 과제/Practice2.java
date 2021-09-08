package practice2;

public class Practice2 {

	public static void main(String[] args) {
		//원의 넓이 구하고 출력하는 프로그램
		double radius;  //원의 반지름
		double area;   //원의 넓이
		
		//step1. 반지름 지정하기
		radius = 15;
		//step2. 반지름을 통해서 넓이 계산하기
		area = Math.PI * radius * radius;
		//step3. 넓이 출력하기
		System.out.println(area);
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("이름과 학번을 입력하세요");
		String name = input.next();
		int num = input.nextInt();
		System.out.println("이름: " + name + ",학번: " + num);
	}

}
