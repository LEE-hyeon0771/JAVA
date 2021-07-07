package ifloopAlone;

public class Practice4 {

	public static void main(String[] args) {
		
		System.out.println("<< º° Âï±â >>");
		
		int space = 3;
		
		
		for(int i = 0; i<4; i++) {
			for(int j = space; j>0; j--) {
				System.out.print(' ');
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print('*');
			}
			for(int j = space; j>0; j--) {
				System.out.print(' ');
			}
			
			space--;
			
			System.out.println();
			
			
		}
	}

}
