package labs;
import java.util.Scanner;


public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int input = inKey.nextInt();
		Scanner inKey2 = new Scanner(System.in);
		System.out.println("Enter another positive integer: ");
		int input2 = inKey2.nextInt();
		
		double num1 = Math.pow(input, input2);
		System.out.println(input + "^" + input2 + " = " + num1);
	}
	
	
	
	
	public static void problem02() {
		
		System.out.println("\n\n");
		Scanner inKey3 = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int input3 = inKey3.nextInt();
		
		double num2 = Math.sqrt(input3);
		
		System.out.println("The square root of " + input3 + " is " + num2);
		
		System.out.println("\n\n\n");
	}

	
	

	public static void problem03() {
		
		System.out.println("Enter the sides of the right triangle.");
		Scanner inKey4 = new Scanner(System.in);
		System.out.println("Length of side A: ");
		int sideA = inKey4.nextInt();
		
		Scanner inKey5 = new Scanner(System.in);
		System.out.println("Length of side B: ");
		int sideB = inKey5.nextInt();
		
		//A^2 + B^2 = C^2
		//get the square root for both inputs and then square the sum 
		double num3 = sideA* sideA;
		double num4 = sideB * sideB;
		double num5 = num3 + num4;
		double sum = Math.sqrt(num5);
		System.out.println("Hypotenuse = " + sum );

	}


	
	
	public static void problem04() {
		
		Scanner inKey6 = new Scanner(System.in);
		
		int input = -1 ;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	 
		
		while(input !=0) {  
			
			
			
			System.out.print("Enter Any Number: ");
			input = inKey6.nextInt();
			min = Math.min(min, input);
			max = Math.max(max, input);
			
			
			
		}
		
		
		System.out.println("Max = " + max + "\nMin = " + min );
		
	}
	
	
	
	
	
	
}
