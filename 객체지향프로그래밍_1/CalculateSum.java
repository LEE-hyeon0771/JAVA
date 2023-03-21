public class CalculateSum
{
    public static int findSum(int n)
    {
        /* fill in the blank */
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }      //sum 변수에 1~n까지를 더함
        return sum;
    }


    public static void main(String[] args)
    {
        /* Find the sum from 1 to n using any loop statements
         * and print out the sum
         */
        
        System.out.println(findSum(100));       // 5050       
        System.out.println(findSum(1234));      // 761995  
        System.out.println(findSum(1000));      // 500500
    }
}
