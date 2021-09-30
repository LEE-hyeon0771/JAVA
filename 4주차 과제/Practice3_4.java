package practice3;

public class Practice3_4 {

	public static void main(String[] args) {
		  int num = 0;
		  int count = 0;
		  System.out.println("처음 50개의 소수는:");
	      for(int i = 2; i<=1000; i++) {
	         for(int j = 2; j<=i; j++) {
	            if(i%j == 0) {
	               num++;
	               
	            }
	         }
	         if(num == 1) {
	            System.out.print(i + " ");
	            count++;
	            
	         if(count%10==0) {
		        	 System.out.println();
		     }
	         }
	         num=0;
	         if(count == 50) {
		        	  break;
		     }
	      }   
	     
	}
}
