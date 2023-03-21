import java.util.ArrayList;

public class ListExample
{
    public static void main(String[] args)
    {
        /* 1. Create an empty ArrayList of weekdays variable using new operator */

        /* fill in the blank */
    	ArrayList<String> weekdays = new ArrayList<String>(); 
    	//ArrayList 선언
        /* 2. add all weekdays from Monday to Sunday into weekdays variable
         * using add() method.
         */
        //weekdays 리스트에 Monday ~ Sunday 추가
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        /* fill in the blank */

        /* 3. Print out each weekday stored in weekdays one by one. Use any
         * loop statements and indexing technique(method) for ArrayList. */
        
        for(int i = 0; i < weekdays.size(); i++) {
        	System.out.println(weekdays.get(i));
        }    //weekdays 사이즈 만큼 get(i)로 출력
        System.out.println();
        /* Output example:
           Monday
           Tuesday
           Wednesday
           Thursday
           Friday
           Saturday
           Sunday
         */

        /* 4. Remove Wednesday off the list stored in weekdays. Print out
         * each element from weekdays variable and confirm that Wednesday
         * entry has been removed.
         */
        weekdays.remove(2);
        //weekdays에서 수요일 인덱스 2를 remove
        for(int i = 0; i < weekdays.size(); i++) {
        	System.out.println(weekdays.get(i));
        }   //weekdays 리스트의 사이즈 만큼 get(i)를 사용하여 출력
        /* Output example:
           Monday
           Tuesday
           Thursday
           Friday
           Saturday
           Sunday
         */
    }
}
