package convert;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text you want to convert: ");
		String inpString = 
				input.nextLine();
		Converter con = new Converter(inpString);
		System.out.println("In Binary: \n" + con.toBinary() + "\n In HexaDecimal : \n" + con.toHex());
	}
}
