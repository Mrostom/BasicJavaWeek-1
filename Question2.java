/** Test
 * Project details:Finding an invalid number
 * @author Mohamed ROSTOM
 * @since 4/27/2020
 * @version 1.0
 */


import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userinput  = new Scanner(System.in);

		System.out.print("Enter a number: ");
		 double number = userinput .nextDouble(); // .nextDouble(), .nextInt()
		
				if (( number<200) && (number%2 == 0)){ 
				
					System.out.println("valid number " ); 
				} 
				else
				{
					System.out.println("invalid number"); 
			} 
	}
	}

