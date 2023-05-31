import java.util.Scanner;

public class PrimeNumCheck 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i_num = scanner.nextInt();
		boolean bool_isPrime = true;
		
		if( i_num < 2 )
		{
			bool_isPrime = false;
		}
		else
		{
			for( int i_control = 2; i_control <= i_num/2; i_control++ )
			{
				if( i_num % i_control == 0 )
				{
					bool_isPrime = false;
					break;
				}
			}
		}
		
		if( bool_isPrime )
		{
			System.out.println(i_num+" is a prime number.");
		}
		else
		{
			System.out.println(i_num+" is not a prime number.");
		}
		scanner.close();
	}
}