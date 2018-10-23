package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed int String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((e)->{
			for (int i = e.length() - 1; i > -1; i--) {
				System.out.print(e.charAt(i));
			}
			System.out.print("\n");
		}, "on");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((e)->{
			for (int i = 0; i < e.length(); i++) {
				if (i % 2 == 0) {
					System.out.print(Character.toUpperCase(e.charAt(i)));
				}
				else {
					System.out.print(Character.toLowerCase(e.charAt(i)));
				}
			}
			System.out.print("\n");
		}, "more");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((e)->{
			for (int i = 0; i < e.length(); i++) {
				System.out.print(e.charAt(i));
				System.out.print(".");
			}
			System.out.print("\n");
		}, "lamb");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((e)->{
			for (int i = 0; i < e.length(); i++) {
				if (e.charAt(i) != 'a' && e.charAt(i) != 'e' && e.charAt(i) != 'i' && e.charAt(i) != 'o' && e.charAt(i) != 'u') {
					System.out.print(e.charAt(i));
				}
			}
			System.out.print("\n");
		}, "das");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
