/** Test
 * Project details:Tip calculator
 * @author Mohamed ROSTOM
 * @since 4/27/2020
 * @version 1.0
 */
import java.util.Scanner;
 
public class Question4 {
 
  public static void main(String [] args) {

	double rate1 = 0.1;
    double rate2 = 0.15;
    double rate3 = 0.2;
 
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter the total : ");
     double total = input.nextDouble();
    System.out.printf("10%%: %.2f \n", (total*rate1));
    System.out.printf("15%%: %.2f \n", (total*rate2));
    System.out.printf("20%%: %.2f \n", (total*rate3));
  }
}