package classpart;

public class ShoppingMallText {

	public static void main(String[] args) {
		ShoppingMall order = new ShoppingMall();
			order.num = 201803120001L;
			order.id = "abc123";
			order.date = "2018�� 3�� 12��";
			order.name = "ȫ���";
			order.productnum = "PD0345-12";
			order.address = "����� �������� ���ǵ��� 20����";
			
			System.out.println("�ֹ���ȣ:" + order.num);
			System.out.println("�ֹ��� ���̵�:" + order.id);
			System.out.println("�ֹ���¥:" + order.date);
			System.out.println("�ֹ��� �̸�:" + order.name);
			System.out.println("�ֹ� ��ǰ ��ȣ:" + order.productnum);
			System.out.println("��� �ּ�:" + order.address);
		

	}

}
