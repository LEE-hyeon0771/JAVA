public class ArrayExample
{
    public static void main(String[] args)
    {
        /* 1. Create a String array with 7 slots for storing weekdays. Store
         * each weekday in English. (such as Monday, Tuesday, ..., and Sunday)
         */

        /* fill in the blank */ 
    	String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};/* fill in the blank */;
    	//weekdays �迭 ����

        /* 2. Print out each weekday stored in weekdays one by one. Use any
         * loop statements (such as for statement) for iteration over the array. */
    	
    	for(int i = 0; i<weekdays.length; i++) {
    		System.out.println(weekdays[i]);
    	}     //weekdays �迭�� ���̸�ŭ index ���

        /* Output example:
           Monday
           Tuesday
           Wednesday
           Thursday
           Friday
           Saturday
           Sunday
         */
    }
}