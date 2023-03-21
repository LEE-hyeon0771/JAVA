public class LetterGrade
{
    public static void main(String[] args)
    {
        double score = 85.6;

        /* Print out the letter grade for the value stored in score variable
         * using any coditional statements.
         * 
         * The letter grading scale:
         *
         * From 90 to 100:  A
         * From 80 to 90:   B
         * From 70 to 80:   C
         * From 60 to 70:   D
         * Below 60     :   F
         */
        
        if(score > 90 && score <= 100) {
        	System.out.println("A");
        }
        else if(score > 80 && score <= 90) {
        	System.out.println("B");
        }
        else if(score > 70 && score <= 80) {
        	System.out.println("C");
        }
        else if(score > 60 && score <= 70) {
        	System.out.println("D");
        }
        else {
        	System.out.println("F");
        }
    }        //if ~ else if ~ else문을 사용하여 각 조건에 맞게 print
}

