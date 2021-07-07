package ifloopAlone;

public class Practice5 {

	public static void main(String[] args) {
		
		System.out.println("<< ´ëÄªÇü º° Âï±â >>");
		int space = 3;
		int star = 1;
		
		for(int i = 0; i<7; i++) {
			if(i<3) {
			for(int j = space; j>0; j--) {
				System.out.print(' ');
			}
			for(int j=0; j<star; j++) {
				System.out.print('*');
			}
			for(int j = space; j>0; j--) {
				System.out.print(' ');
			}
			star+=2;
			space--;
			
			System.out.println();
			}
			else {
				for(int j = 0;j<space;j++) {
					System.out.print(' ');
				}
				for(int j = star;j>0;j--) {
					System.out.print('*');
				}
				for(int j = 0;j<space;j++) {
					System.out.print(' ');
				}
			star-=2;
			space++;
			System.out.println();
			}

	}
}
}
