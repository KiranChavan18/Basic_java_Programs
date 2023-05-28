package exeptionHandling;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a =scan.nextInt();
		
		System.out.println("Enter value of b");
		int b =scan.nextInt();
		
		try {
			System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index position");
		}
		catch(NullPointerException e) {
			System.out.println("Invallid");
		}
		catch(ArithmeticException e) {
			System.out.println("Invallid Denominator");
		}
		
		catch(Exception e) {
			System.out.println("SuperClass Exeption Handler");
		}

	}
}
