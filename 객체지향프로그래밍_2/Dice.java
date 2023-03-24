import java.util.Random;
import java.util.Scanner;

public class Dice/* put appropriate class name here */
{
    public static int singleCubeRoll()
    {
        int number = (int)(Math.random() * 6) + 1;      

        return number;
    }

    public static int[] multipleRolls(int n) /* multipleRolls() function header */
    {
        /* multipleRolls() function body goes here */
    	int[] arr = new int[n];
    	
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = (int)(Math.random() * 6) + 1;      
    	}
        return arr;
    }

    public static void main(String[] args)
    {
        System.out.println("A dice roll: " + singleCubeRoll());

        /* Q: Design a function multipleRolls(n) such that
         * multipleRolls(n) returns dice numbers for
         * rolling n times. The function design must make the
         * code below generate the following output. (Random number 
         * outputs might differ.)
         */

        System.out.print("How many times do you want to roll a dice?: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int diceNumbers[] = multipleRolls(n);/* function call for multipleRolls()? */

        System.out.println("### Dice numbers:");
        for (int number : diceNumbers)
        {
            System.out.println(number);
        }

        /* Output:
         * 
           How many times do you want to roll a dice?: 5
           3
           4
           1
           1
           6
         */
    }
}
