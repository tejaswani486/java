import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double p=scan.nextDouble();
		double r=scan.nextDouble();
		double t=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.printf("%.2f",calculator.calculateSimpleInterest(p, r, t));
		scan.close();
	}

}
