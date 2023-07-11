import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//instantiate scanner
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();//object creation
		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed,time));
		//double res=calculateDistance(speed,time); //if calculateDistance method is static. 
		//System.out.printf("%.2f",res);
		
		// TODO Auto-generated method stub
	}
}
