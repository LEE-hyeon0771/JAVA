import java.util.ArrayList;
import java.util.Scanner;

/* put proper import statemtents here */

public class FunctionAbstractionExample
{
	public static double calculateMean(ArrayList<Integer> scores)
    {
        double mean; 
        double sum = 0;
        for(int i = 0; i<scores.size(); i++) {
        	sum += scores.get(i);
        }
        mean = sum / scores.size();

        return mean;
    }
    public static ArrayList<Integer> getScoresUntilDone()/* method header for getScoresUntilDone() */
    {
        /* Q: Complete a method getScoresUntilDone() that 
         * (1) prints out a prompting message like "Score input? (-1 to quit):"
         * (2) gets individual score inputs from keyboard
         * (2) store them into an ArrayList variable
         * (3) keeps getting keyboard inputs until the user enters -1
         * (4) and returns the ArrayList variable that contain the all the scores
         *
         * NOTE: Make it sure that the method-calling code in main() method
         * can work without modifications.
         *
         *          ArrayList<Integer> scores = getScoresUntilDone();
         */
    	ArrayList<Integer> scores = new ArrayList<>();
    	System.out.println("Score input? (-1 to quit):");
    	Scanner scan = new Scanner(System.in);
        int userInput = 0;
        while(true) {
        	userInput = scan.nextInt();
        	
        	if(userInput == -1) {
        		break;
        	}
        	scores.add(userInput);
        }
        return scores;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> scores = getScoresUntilDone();
        System.out.println("Mean for scores: " + calculateMean(scores));
    }
	
}


