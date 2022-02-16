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
		int lowestNumber = -1;
		launchAngle = Math.cos(Math.toRadians(launchAngle));
		double launchAngle2 = Math.sin(Math.toRadians(launchAngle));
		double xposition = 0;
		double yposition = 0;
		while (!aboveGround) {
			second ++;
			double xposition2 = launchAngle * second * launchVelocity;
			 double yposition2 = launchAngle2 * second * launchVelocity - 0.5 * 9.8 * Math.pow(second, 2);
			System.out.format("Time: " + second);
			System.out.println("     x-pos: " + xposition2 + "m");
			System.out.println("     y-pos: " + yposition2 +"m");
			
			if (yposition < lowestNumber) {
				aboveGround = true;
			}
			
		}
		
		
		

	}


	

		
	
	
}
