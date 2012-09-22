import java.util.Scanner;
/**
 * @author 
 * @date 
 */
public class CalculatorGabriel {

	/**
	 * This class takes input via keyboard to generate a menu for providing calculating one of four operations
	 * Then it takes input via keyboard for the first number followed by the second second number
	 * Then it calculates the result and displays it on the screen
	 * @param args
	 */
	public static void main(String[] args) {

		// Declarations
		int selection, newnumber = -1;
		Scanner kbd = new Scanner(System.in);
		float result = 0;

		// Menu prompt
		System.out.println("Welcome to the most awesome calculator in the world");
		
		
		do {
			
			// Input of numbers via keyboard
			
			// This if statement is just for the first operation when there's no acumulate
			if (result == 0) {
				System.out.print("Tell me a first number: ");
				result = kbd.nextInt();
			}
			System.out.print("Tell me another number: ");
			newnumber = kbd.nextInt();
			
			// End of input numbers
			
			//Choose an operation
			
			System.out.println("Now what operand will you like to apply between: " + result + " and " + (float) newnumber);
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("0. Exit");
			selection = kbd.nextInt();
			
			// Input of numbers via keyboard	
			if(selection >= 1 && selection <= 4) {
				// Using the results from the menu, perform one of 4 operations on the numbers
				switch(selection) {
					case 1:
						result += newnumber;
						break;
					case 2:
						result -= newnumber;
						break;
					case 3:
						result *= newnumber;
						break;
					case 4:
						// Error handling in case of division by 0
						if(newnumber != 0) {
							result = (float) result /  (float) newnumber;
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
		} while (selection != 0);

		// Thank you message upon exit
		System.out.println("Thanks for calculating!");
	}
}



