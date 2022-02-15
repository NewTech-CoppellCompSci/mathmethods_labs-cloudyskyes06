package labs;
import java.util.Scanner;


public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a postive integer: ");
		int num1 = inKey.nextInt();
		
		Scanner inKey2 = new Scanner(System.in);
		System.out.println("Enter another positive integer: ");
		int num2 = inKey2.nextInt();
		
		int minn = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		
		int scope = max - minn +1 ;
		int min = minn;
		for (int i = 0 ; i < 10; i++) {
			
			int num = (int) (Math.random() * scope + min);
			System.out.print(num + " ");
		}
		
		System.out.println("\n\n\n");
	}
	
	
	
	
	public static void problem02() {
		
		//Scanner inKey3 = new Scanner(System.in);
		//System.out.println("Enter the Radius for the cylinder: ");
		//int raduis = inKey3.nextInt();
		
		//Scanner inKey4 = new Scanner(System.in);
		//System.out.println("Enter the Height for the cylinder: ");
		//int height = inKey4.nextInt();
		
		//double pi = Math.PI;
		
		//double volume = pi * Math.pow(raduis, 2) * height;
		
		//System.out.println("The volume of the cylinder is " + volume);
	}

	
	

	public static void problem03() {

		Scanner inKey5 = new Scanner(System.in);
		System.out.println("Enter x1: ");
		double x1 = inKey5.nextInt();
		
		Scanner inKey6 = new Scanner(System.in);
		System.out.println("Enter y1: ");
		double y1 = inKey6.nextInt();
		
		Scanner inKey7 = new Scanner(System.in);
		System.out.println("Enter x2: ");
		double x2 = inKey7.nextInt();
		
		Scanner inKey8 = new Scanner(System.in);
		System.out.println("Enter y2: ");
		double y2 = inKey8.nextInt();
		
		double half = x2 - x1;
		double half2 = Math.pow(half, 2);
		
		double y = y2 - y1;
		double yell2 = Math.pow(y, 2);
		
		double almost = half2 + yell2;
		double almost2 = Math.sqrt(almost);
		
		System.out.println("distance = " + almost2);
		
	}


	
	
	public static void problem04() {
		
		Scanner inKey9 = new Scanner(System.in);
		System.out.println("Enter a-value: ");
		double aval = inKey9.nextInt();
		
		Scanner inKey10 = new Scanner(System.in);
		System.out.println("Enter b-value: ");
		double bval = inKey10.nextInt();
		
		Scanner inKey11 = new Scanner(System.in);
		System.out.println("Enter c-value: ");
		double cval = inKey11.nextInt();
		
		double here = Math.pow(bval, 2);
		double ac = 4 * aval * cval;
		double almost3 = here - ac;
		double closer = Math.sqrt(almost3);
		double Bval = -bval;
		double negative = Bval -+ almost3;
		double divide = aval * 2;
		double closer2 = negative / divide;
		
		
		
		
		System.out.println("x = " + closer2);
		
	}
	
	

	
}
