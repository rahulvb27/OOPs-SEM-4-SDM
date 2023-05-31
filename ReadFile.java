import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input.txt");
		Scanner scanner = new Scanner(file);

		//reading of inputs is done from ~input.txt~ file present outside.
		//refer it!!

		String name = scanner.next();
		int age = scanner.nextInt();

		scanner.close();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}