package communityproject;
import java.util.Scanner;
public class Project_3 {
	
	public static int[][] mtrx = new int[9][9];
	
	public static boolean check(int horizontal, int vertical, int checkNum) {
		for(int i = 0; i<9; i++) {
			if(mtrx[horizontal][i] == checkNum) {         //행에서 넘버체킹, 같으면 잘못됨 반환
				return false;
			}
		}
		
		for(int j = 0; j<9; j++) {
			if(mtrx[j][vertical] == checkNum) {            //열에서 넘버체킹, 같으면 잘못됨 반환
				return false;
			}
		}
		int h = horizontal / 3 * 3;
		int v = vertical / 3 * 3;                          //3*3행렬의 배열의 수 체크
		for(int i = 0; i < 3; i++) {                       //0,1,2로 3*3의 배열 컨트롤이 가능하므로 3까지 for문 반복
			for(int j = 0; j < 3; j++) {
				if(mtrx[i+h][j+v] == checkNum) {           //행렬
					return false;
				}
			}
		}
		return true;

	}
	
	public static void matrixTemplate(int horizontal, int vertical) {
		if(vertical == 9) {                   //열 인덱스 값이 9까지 오면 한 행을 모두 조사 했다는 뜻이므로 
			matrixTemplate(horizontal + 1, 0);         //다음 (1,0)부터 시작하므로 다음 행으로 이동시킨다.
			
		}
		if(horizontal == 9) {
			for(int i = 0; i<9; i++) {
				for(int j = 0; j<9; j++) {
					System.out.print(mtrx[i][j] + " ");
				}                                   
			System.out.println();
			}
		
			System.exit(0);   //9*9가 완성되었으므로 출력하고 하나의 스도쿠만 만들어야 하므로 exit 시켜줌.
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
