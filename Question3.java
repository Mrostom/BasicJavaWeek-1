
public class Question3 {
	/** Test
	 * Project details:Fibonacci series
	 * @author Mohamed ROSTOM
	 * @since 4/27/2020
	 * @version 1.0
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */

	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	}

	}
}
