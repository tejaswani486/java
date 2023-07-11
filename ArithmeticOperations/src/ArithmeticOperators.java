import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int result1=subtractNumbers(num1,num2);
		System.out.println(result1);

		int result2=multiplyNumbers(num1,num2);
		System.out.println(result2);

		double result3=divideNumbers(num1,num2);
		System.out.printf("%.2f\n",result3);

		int result4=findRemainder(num1,num2);
		System.out.println(result4);
	}
	public static int subtractNumbers(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}

}
