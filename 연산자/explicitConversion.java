package Chapter2;

public class explicitConversion {
	public static void main(String[] args) {
		//����(�����) ����ȯ
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);   //byte�� ����(-128~127) �̻��̹Ƿ� �ڷ� �ս� �߻�
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;    // 3+0 = 3
		int num2 = (int)(dNum + fNum);      // (int)4.23 -> 4
		System.out.println(num1);
		System.out.println(num2);
	}
}
