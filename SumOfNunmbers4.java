import java.util.Scanner;

public class SumOfNunmbers4 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int i_num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int i_num2 = scanner.nextInt();
		int i_sum = i_num1 + i_num2;
		System.out.println("The sum of the numbers is: "+i_sum);
		
		switch (Integer.signum(i_sum))
		{
		case -1:
			System.out.println("The sum is negative.");
			break;
		case 0:
			System.out.println("The sum is ZERO.");
			break;
		case 1:
			System.out.println("The sum is positive.");
			break;
		}
		scanner.close();
	}
}