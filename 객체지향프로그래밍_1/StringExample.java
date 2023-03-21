public class StringExample
{
    public static void main(String[] args)
    {
        /* 1. Concatenate the following two String variables and print out
         * "Hello there.I feel good." Use concatenation operator for String.
         */

        String firstMessage = "Hello there.";
        String secondMessage = "I feel good.";
        
        String result1 = firstMessage.concat(secondMessage);   //concat 사용
        System.out.println(result1);
        
        /* 2. Convert the following message into uppercase and print out the
         * result.
         */ 

        String messageForConversion = "The quick brown fox jumps over the lazy dog.";
        
        String result2 = messageForConversion.toUpperCase();    //toUpperCase 사용
        System.out.println(result2);
        /* 3. Use split() method in String and split the sentence into words.
         * Then print out each word as follows. Need to use array and any loop
         * statements.
         */

        String sentence = "Conditions worsen in Ukraine as war enters one year.";
        String[] arr = sentence.split(" ");       //배열 내에서 빈칸을 split 기준으로 삼아 split
        
        for(int i = 0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        /* Example:
           Conditions
           worsen
           in
           Ukraine
           as
           war
           enters
           one
           year..
        */         
    }
}

