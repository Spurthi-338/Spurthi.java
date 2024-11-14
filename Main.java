import CIE.Student;
import CIE.Internal;
import SEE.External;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students whose details you want to enter");
		int n = sc.nextInt();
		Internal[] i1 = new Internal[n];
		External[] e1 = new External[n];
		for(int i=0;i<n;i++) {
			System.out.println("Student "+(i+1)+" details:");
			e1[i] = new External();
			i1[i] = new Internal();
			e1[i].getd();
			i1[i].getMarks();
			e1[i].getMarks();
		}
		for(int i=0;i<n;i++) {
			e1[i].display();
			e1[i].calcTotalMarks(i1[i]);
		}

	}
}
