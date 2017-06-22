package Assignment;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {

				
				Scanner in = new Scanner(System.in); // input from user
				
				System.out.println("Enter the first number "); // console window
				byte number1 = in.nextByte();
				
				System.out.println("Enter the second number ");
				short number2 = in.nextShort();
				
				byte j = number1;
				short k= number2;
				int i;
				long l;
				float f;
				double d;
				// automatic conversion 
				i= j+k; //sum of byte and short 
				System.out.println("Sum of byte and short: "+ i); // console window
				l= k+i; //
				System.out.println("Sum of int and short: "+ l); // console window
				f= i+l; // sum of byte and short
				System.out.println("Sum of int and long: "+ f); // console window
				d= l+f; // sum of byte and short
				System.out.println("Sum of long and float: "+ d); // console window
				

			}

			
			}

	
