package basicPrograms;

import java.util.Scanner;

public class CalculaterTester {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Calculater c=new CalculaterImpl();
		
		System.out.println("---Welcome to Calculater project");
		System.out.println("===================================");
		
		while(true) {
			System.out.println("1:Additon\n2:Subtrction\n3:Multiplication");
			System.out.println("4:Division\n5:Exit");
			System.out.println("Enter Choice:");
			int choice=scan.nextInt();
			
			int a=0;
			int b=0;
			
			if(choice >=1&&choice<=4) {
				System.out.println("Enter First Number");
				 a=scan.nextInt();
				System.out.println("Enter Second Number");
				 b=scan.nextInt();
			}
			switch(choice) {
			case 1:
				int sum=c.add(a, b);
				System.out.println("sum: "+sum);
				break;
				
			case 2:
				int diff=c.sub(a, b);
				System.out.println("difference: "+diff);
				break;
				
			case 3:
				System.out.println("multiplication: "+c.mul(a, b));
				break;
				
			case 4:
				System.out.println("Division: "+c.div(a, b));
				break;
				
			case 5:
				System.out.println("Thank You!");
				System.exit(0);
				
				default:
					System.out.println("Invallid Choice");
			}
			System.out.println("-----------------------------------------------");
		}
	}

}
