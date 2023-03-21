public class PrintTriangle
{
    public static void main(String[] args)
    {
        /* Print out the following triangular shape
         * using any loop statements.
         */

        /* Output: 
                      #
                     ## 
                    ###
                   ####
                  #####
                 ######
                #######
               ########
              #########
             ##########
            ###########
           ############
         */
    	
    	for(int i = 1; i<13; i++) {
    		for(int j = 12; j>i ; j--) {
    			System.out.print(" ");
    		}     //빈칸 출력
    		for(int j = 0; j<i; j++) {
    			System.out.print("#");
    		}     //순차적으로 #출력
    		System.out.println();
    	}
    }
}

