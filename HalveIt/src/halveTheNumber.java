import java.util.Scanner;

public class halveTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double num=scan.nextDouble();
		System.out.printf("%.2f",halveOfTheNumber(num));
		scan.close();

	}
	public static double halveOfTheNumber(double num)
	{
		return num/2.0;
	}

}
