package convert;

import java.util.*;

public class Converter {
	private final String text;
	public Converter(String text)
	{
		this.text = text;
	}
	
	// The following methods are declared as String since i want
	// to show every number as fixed 8-sized bits (one byte) which may start
	// with leading zeros
	
	//for converting one number
	private String decimalToBinary(int number)
	{
		String binaryString = "";
		for (int i = 0; i < 8; i++,number /= 2)
		{
			if (number != 0)
			{
			binaryString += (number % 2 == 0 ? '0' : '1');
			}
			else {
				binaryString += '0';
			}
		}
		
		return (new StringBuilder(binaryString)).reverse().toString();
	}
	
	public String toBinary()
	{
		String binaryString = "";
		for (int i = 0; i < text.length(); i++)
		{
			binaryString += decimalToBinary(text.charAt(i)) + " ";
		}
		return binaryString;
	}
	
	public String toHex()
	{
		String binaryString = "";
		for (int i = 0; i < text.length(); i++)
		{
			binaryString += decimalToHex(text.charAt(i)) + " ";
		}
		return binaryString;
	}
	//for converting one number
	private String decimalToHex(int number)
	{
		String binaryString = "";
		int mod;
		for (int i = 0; i < 2; i++,number /= 16) { // 8 bits = 2 nibbles = 2 hex character 
			mod = number % 16;
			if (mod < 10)
				binaryString += mod;
			else
				binaryString += (char)((mod - 10) + 'A');
		}
		return '#' + (new StringBuilder(binaryString).reverse()).toString();
	}
}
