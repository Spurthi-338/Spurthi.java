import java.util.Scanner;
class student {
    String usn;
    String name;
    int no_of_subjects;
    int[] credits;
    int[] marks;
    public void accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter usn:");
        usn = sc.nextLine(); 
        System.out.println("enter name:");
        name = sc.nextLine(); 
        System.out.println("enter no of subjects:");
        no_of_subjects = sc.nextInt();
        credits = new int[no_of_subjects];
        marks = new int[no_of_subjects];
        System.out.println("enter credits and marks of each subject:");
        for(int i=0;i<no_of_subjects; i++)
        {
            System.out.println("credits:");
            credits[i]=sc.nextInt();
            System.out.println("marks:");
            marks[i]=sc.nextInt();
        }
    }
    public void display()
    {
        System.out.println("student details:");
        System.out.println("usn:"+usn);
        System.out.println("name:"+name);
        System.out.println("credid and marks:");
        for (int i=0;i<no_of_subjects; i++)
        {
            System.out.println("subject:"+(i+1)+" credits:" +credits[i]+"marks:"+marks[i]);
        }
    }
    public int gradepoint (int marks)
    {
        if (marks>= 90)
        {
            return 10;
        }
        else if (marks>= 80)
        {
            return 9;
        }
        else if (marks>= 70)
        {
            return 8;
        }
        else if (marks>= 60)
        {
            return 7;
        }
        else if (marks>= 50)
        {
            return 6;
        }
        else if (marks>= 40)
        {
            return 5;
        }
        else
        {
            return 0;
        }
    }
    public double calculate_sgpa()
    {
        int total_credits =0;
        int sum =0;
        for (int i =0; i< no_of_subjects; i++)
        {
            int grade_point = gradepoint (marks[i]);
            sum+= grade_point * credits[i];
            total_credits+=credits[i];
        }
        return (double)sum/total_credits;
    }
}
public class Main{
    public static void main(String[] args)
    {
        student student = new student();
        student.accept_details();
        student.display();
        double sgpa= student.calculate_sgpa();
        System.out.println("sgpa");
    }
}
