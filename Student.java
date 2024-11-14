package CIE;
import java.util.Scanner;
public class Student {
	String usn;
	String name;
	int sem;
	public void getd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student USN");
		usn = sc.nextLine();
		System.out.println("Enter student name");
		name = sc.nextLine();
		System.out.println("Enter semester");
		sem = sc.nextInt();
	}
	public void display() {
		System.out.println();
		System.out.println("Student USN: "+usn);
		System.out.println("Student name: "+name);
		System.out.println("Semester: "+sem);
		System.out.println();	
	}
}