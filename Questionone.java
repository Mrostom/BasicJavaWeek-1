/** Test
 * Project details:Finding a varibale
 * @author Mohamed ROSTOM
 * @since 4/27/2020
 * @version 1.0
 */



import java.util.Scanner;

public class Questionone {

	
	public static void main(String[] args) {
	Scanner userinput  = new Scanner(System.in);
		        System.out.print("Enter a Number: ");
		        int number = userinput  .nextInt(); 
			   
			if(number < 100){
				System.out.println("Variable is less than 100");
			}
			else if(number ==100)
			{
				System.out.println("Variable is equal to 100");
			}
			else if (number >100)
			{
				System.out.println("Variable is greater than 100");
			}
		}
	}


