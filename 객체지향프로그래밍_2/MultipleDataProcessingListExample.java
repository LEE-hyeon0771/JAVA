import java.util.ArrayList;
import java.util.Scanner;

/* put proper import statemtents here */
public class MultipleDataProcessingListExample
{
    public static double calculateMean(ArrayList<Integer> scores)/* define calculateMean() method here and below */
    {
        double mean; 
        double sum = 0;
        for(int i = 0; i<scores.size(); i++) {
        	sum += scores.get(i);
        }
        mean = sum / scores.size();

        return mean;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> scores = new ArrayList<Integer>();

        /* Get score inputs using Scanner */
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        Integer integerObject = null;
        
        while(true) {
        	userInput = scan.nextInt();
        	
        	if(userInput == -1) {
        		break;
        	}
        	scores.add(userInput);
        }
        	

        /* Write code lines that (1) get score inputs from the keyboard
         * (2) keep receiving inputs until the user enters -1. The inputs
         * must be stored in scores ArrayList variable defined up. When the
         * scores variable is ready with all the inputs, pass it to
         * calculateMean() method to calculate the mean. Use while or do-while
         * statement for the input looping.
         *
         * NOTE: Do not forget to eliminate -1 entry in the scores list 
         * before passing it to calculateMean() method
         */

        System.out.println("Mean for scores: " + calculateMean(scores));
    }

	
}


