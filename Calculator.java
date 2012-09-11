import java.util.Scanner;


public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int selection = -1;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Welcome to the most awesome calculator in the world");
		do {
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("0. Exit");
			
			selection = kbd.nextInt();
			if(selection < 0 || selection > 4) {
				System.out.println("C\'mon now. You can do this properly");
				continue;
			}
			
			System.out.print("Tell me a number: ");
			int number1 = kbd.nextInt();
			System.out.print("Tell me another number: ");
			int number2 = kbd.nextInt();
			float result = -99999;
			
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
				if(number2 == 0) {
					System.err.println("Wow wow wow. You'll break everything");
					continue;
				}
				else {
					result = (float) number1 /  (float) number2;
					break;
				}
			}
			
			
			System.out.println("Thanks very much. Your answer is "+ result);
			
		} while (selection != 0);

	}

}
