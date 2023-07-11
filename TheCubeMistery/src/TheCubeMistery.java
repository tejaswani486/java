import java.util.Scanner;

public class TheCubeMistery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(cubeNumber(num));
		
		// TODO Auto-generated method stub
		scan.close();

	}
	public static int cubeNumber(int num) {
		return num*num*num;
	}

}
