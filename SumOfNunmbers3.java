import java.util.Scanner;

public class SumOfNunmbers3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int i_num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int i_num2 = scanner.nextInt();
		int i_sum = i_num1 + i_num2;
		System.out.println("The sum of the numbers is: "+i_sum);
		
		if( i_sum > 0 )
		{
			System.out.println("The sum is positive.");
		}
		else if ( i_sum < 0 )
		{
			System.out.println("The sum is negative.");
		}
		else
		{
			System.out.println("The sum is ZERO.");
		}
		scanner.close();
	}
}