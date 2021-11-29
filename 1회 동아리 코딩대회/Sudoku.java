package communityproject;
import java.util.Scanner;
public class Project_3 {
	
	public static int[][] mtrx = new int[9][9];
	
	public static boolean check(int horizontal, int vertical, int checkNum) {
		for(int i = 0; i<9; i++) {
			if(mtrx[horizontal][i] == checkNum) {         //�࿡�� �ѹ�üŷ, ������ �߸��� ��ȯ
				return false;
			}
		}
		
		for(int j = 0; j<9; j++) {
			if(mtrx[j][vertical] == checkNum) {            //������ �ѹ�üŷ, ������ �߸��� ��ȯ
				return false;
			}
		}
		int h = horizontal / 3 * 3;
		int v = vertical / 3 * 3;                          //3*3����� �迭�� �� üũ
		for(int i = 0; i < 3; i++) {                       //0,1,2�� 3*3�� �迭 ��Ʈ���� �����ϹǷ� 3���� for�� �ݺ�
			for(int j = 0; j < 3; j++) {
				if(mtrx[i+h][j+v] == checkNum) {           //���
					return false;
				}
			}
		}
		return true;

	}
	
	public static void matrixTemplate(int horizontal, int vertical) {
		if(vertical == 9) {                   //�� �ε��� ���� 9���� ���� �� ���� ��� ���� �ߴٴ� ���̹Ƿ� 
			matrixTemplate(horizontal + 1, 0);         //���� (1,0)���� �����ϹǷ� ���� ������ �̵���Ų��.
			
		}
		if(horizontal == 9) {
			for(int i = 0; i<9; i++) {
				for(int j = 0; j<9; j++) {
					System.out.print(mtrx[i][j] + " ");
				}                                   
			System.out.println();
			}
		
			System.exit(0);   //9*9�� �ϼ��Ǿ����Ƿ� ����ϰ� �ϳ��� ������ ������ �ϹǷ� exit ������.
		}
		
		int k = 0;
		
		if(mtrx[horizontal][vertical] == k) {
			for(int i = 1; i<=9; i++) {
				if(check(horizontal,vertical,i)) {
					mtrx[horizontal][vertical] = i;
					matrixTemplate(horizontal,vertical + 1);
				}
			}
			mtrx[horizontal][vertical] = k;
			
		}
		matrixTemplate(horizontal,vertical + 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				mtrx[i][j] = sc.nextInt();
			}
		}
		matrixTemplate(0,0);
		
		
	}
	
}
