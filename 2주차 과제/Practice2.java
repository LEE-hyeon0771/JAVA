package practice2;

public class Practice2 {

	public static void main(String[] args) {
		//���� ���� ���ϰ� ����ϴ� ���α׷�
		double radius;  //���� ������
		double area;   //���� ����
		
		//step1. ������ �����ϱ�
		radius = 15;
		//step2. �������� ���ؼ� ���� ����ϱ�
		area = Math.PI * radius * radius;
		//step3. ���� ����ϱ�
		System.out.println(area);
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("�̸��� �й��� �Է��ϼ���");
		String name = input.next();
		int num = input.nextInt();
		System.out.println("�̸�: " + name + ",�й�: " + num);
	}

}
