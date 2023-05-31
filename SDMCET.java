import java.util.Scanner;
class Student{
	String name, usn;
	int IA1,IA2,IA3;
}
class Teacher{
	String name, designation;

	void EnterMarks (Student Who)
	{
		Scanner e = new Scanner(System.in);
		System.out.println("Enter the students name: ");
		Who.name=e.next();
		System.out.println("Enter the students usn: ");
		Who.usn=e.next();
		System.out.println("Enter the IA1: ");
		Who.IA1=e.nextInt();
		System.out.println("Enter the IA2: ");
		Who.IA2=e.nextInt();
		System.out.println("Enter the IA3: ");
		Who.IA3=e.nextInt();
	}
}
public class SDMCET {
	public static void main (String args [])
	{
		Scanner input = new Scanner(System.in) ;
		Teacher T=new Teacher() ;
		T.name="GMS";
		T.designation="AP";
		Student s1[]= new Student[3];
		for (int i=0; i<3; i++) {
			s1[i]=new Student();
			T.EnterMarks (s1[i]) ;
		}
		System.out.print ("Enter USN no whose details you want: ");
		String key = input.next();
		for (int j=0;j<3;j++) {
			if (s1[j].usn.equals(key)) {
				System.out.println("Details of the students: ");
				System.out.println("Name: "+s1[j].name);
				System.out.println("USN: "+s1[j].usn) ;
				System.out.println("IA1: "+s1[j].IA1);
				System.out.println("IA2: "+s1[j].IA2);
				System.out.println("IA3: "+s1[j].IA3);
			}
		}
		input.close();
	}
}