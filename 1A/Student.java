import java.io.*;
import java.util.*;
public class Student {
	private String Usn;
	private String Name;
	private String Branch;
	private Long Phone;
	public Student(String Usn,String Name,String Branch,Long Phone){
	this.Usn = Usn;
	this.Name = Name;
	this.Branch = Branch;
	this.Phone = Phone;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Students");
		int n = scan.nextInt();
		Student[] students = new Student[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Please Enter the Usn");
		String Usn  = System.console().readLine();
		System.out.println("Please Enter the Name");
		String Name = System.console().readLine();
		System.out.println("Please Enter the Branch");
		String Branch = System.console().readLine();
		System.out.println("Please Enter the Phone No");
		Long Phone = sc.nextLong();
	students[i] = new Student(Usn,Name,Branch,Phone);
		}
		for(int i=0;i<n;i++)
		{
		System.out.println("Student " + (i+1) + " Usn" + "=" + students[i].Usn);
System.out.println("Student " + (i+1) + " Name" + "=" + students[i].Name);
System.out.println("Student " + (i+1) + " Branch" + "=" + students[i].Branch);
System.out.println("Student " + (i+1) + " Phone" + "=" + students[i].Phone);

		}  		 
	}
}
