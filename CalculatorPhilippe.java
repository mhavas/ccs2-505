package Calculator;
/**
 * 
 */
import java.util.Scanner;
/**
 * @author 
 * @date 
 */
public class Calculator {

	/**
	 * This class takes input via keyboard to generate a menu for providing calculating one of four operations
	 * Then it takes input via keyboard for the first number followed by the second second number
	 * Then it calculates the result and displays it on the screen
	 * @param args
	 */
	public static void main(String[] args) {

// Declarations

		int selection, number1, number2 = -1;
		Scanner kbd = new Scanner(System.in);
		float result = -99999;

// Menu prompt
		
		System.out.println("Welcome to the most awesome calculator in the world");
		do {
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("0. Exit");
			
			selection = kbd.nextInt();

// Input of numbers via keyboard	
			
			if(selection >= 1 && selection <= 4) {
				
				System.out.print("Tell me a number: ");
				number1 = kbd.nextInt();
				System.out.print("Tell me another number: ");
				number2 = kbd.nextInt();

// Using the results from the menu, perform one of 4 operations on the numbers
				
				switch(selection) {
				case 1:
					result = number1 + number2;
					break;
				case 2:
					result = number1 - number2;
					break;
				case 3:
					result = number1 * number2;
					break;
				case 4:
					
// Error handling in case of division by 0

					if(number2 != 0) {
						result = (float) number1 /  (float) number2;
						break;
					}
					else {
						System.err.println("Woa woa woa. You'll break everything");
					}
				}	
// Output of result
				
			System.out.println("Thanks very much. Your answer is "+ result);
			}			
			else if (selection != 0){
				System.out.println("C\'mon now. You can do this properly");
			}
			
// Repeat menu unless Exit is pressed
			
		} while (selection != 0);

// Thank you message upon exit
		
		System.out.println("Thanks for calculating!");
	}
}



