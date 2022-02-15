package labs;
import java.util.Scanner;
public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter launch velocity (m/s): ");
		double launchVelocity = inKey.nextInt();
		
		
		Scanner inKey2 = new Scanner(System.in);
		System.out.println("Enter launch angle (degrees): ");
		double launchAngle = inKey2.nextInt();
		
		System.out.println("Time: 0s");
		System.out.println("     x-pos: 0.0m");
		System.out.println("     y-pos: 0.0m");
		
		
		
		boolean aboveGround = false;
		int second = 1;
		int lowestNumber = 0;
		
	
		
		
		while (!aboveGround) {
			 
			System.out.format("Time: " + second);
			System.out.println("     x-pos: " + + "m");
			System.out.println("     y-pos: " + + "m");
			second ++;
			if ( < lowestNumber) {
				aboveGround = true;
			}
			
		}
		
		
		

	}


	

		
	
	
}
