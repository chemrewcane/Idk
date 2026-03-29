package W;

import java.util.Scanner;

public class Whileloops {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		//While loop - unknown numbers of iteration
		//Example
////		int x = 1;
////	while (x<3) {
////		System.out.println("Hello");
////	} 
		//Infinite loop. We need to fix this by using counter-controlled
		
		//Counter-controlled
		//Example
////	while (x<3) {
////		System.out.println("Hello");
////		x++; 
////	} // Result: two 'Hello"
		
		//Flag-controlled - booleans
		//Example
////		boolean p = true;
////		while(p) {
////			System.out.println("Hell yeah");
////		} // Infinite loop. to fix this, lets add if-selection
////		int r = 7;
////		while(p) {
////			if (r==7) {
////				p = false;
////				System.out.println("Hell yeah");
////			}
////		}

		//Sentinel-controlled - decides on a specific value when to stop.
		//Example
////		String input = "";
////		while (!input.equalsIgnoreCase("Exit")) {
////			System.out.print("Enter words or (Exit) to stop: ");
////			input = sc.nextLine();
////			if (!input.equalsIgnoreCase("Exit")) {
////				System.out.println("Input: " + input);
////			}
////		}
////		System.out.println("Tsarann end"); //Loop stopped if you will enter exit.

		//EOF (End-Of-File) - from my understanding, the Operating system itself will tell you if your data is finished.
		//Example
////		System.out.print("Type anything (Ctrl+Z to EOF): ");
////		while (sc.hasNext()) {
////			String word = sc.next();
////			System.out.println("Typed: " + word);
////		} System.out.println("EOF"); //If you click Ctrl+Z, it will stop
	}
}