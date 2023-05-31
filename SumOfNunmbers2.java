import java.util.Scanner;

public class SumOfNunmbers2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int i_num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int i_num2  = scanner.nextInt();
		int i_sum = i_num1 + i_num2;
		System.out.println("The sum of the numbers is: "+i_sum);
		scanner.close();
	}
}