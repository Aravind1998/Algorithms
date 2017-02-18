import java.util.Scanner;
import java.io.*;
class Staff {
String Name;
String StaffId;
Long Phone;
Long Salary;
void read()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Name");
Name = sc.next();
System.out.println("Enter the StaffId");
StaffId = sc.next();
System.out.println("Enter the Phone Number");
Phone = sc.nextLong();
System.out.println("Enter the Salary");
Salary = sc.nextLong();
}
void disp()
{
System.out.println("Name of Staff\n " + Name + "\nStaffId\n"   + StaffId+ "\nPhone\n" + Phone +  "\nSalary\n" + Salary);
}
}
class Teaching extends Staff {
Scanner sc1 = new Scanner(System.in);
String Domain;
String publications;
void read_data()
{
read();
System.out.println("Enter the Domain");
Domain = sc1.next();
System.out.println("Enter the publications");
publications = sc1.next();
}
void display_data()
{
disp();
System.out.println("\nDomain\n" + Domain +  "\nPublications\n" + publications );
}
}
class Technical extends Staff{
Scanner in = new Scanner(System.in);
String Skills;
void read_data()
{
read();
System.out.println("Enter the Skills of the staff");
Skills = in.next();
}
void display_data()
{
disp();
System.out.println("Skills\n" + Skills );
}
}
class Contract extends Staff{
Long Experience;
Scanner d = new Scanner(System.in);
void read_data()
{
read();
System.out.println("Enter the experience");
Experience = d.nextLong();
}
void display_data()
{
disp();
System.out.println("Experience\n : " + Experience + "\n");
}
}
public class Lab2a {
public static void main(String[] args)
{
Teaching t = new Teaching();
Technical tc = new Technical();
Contract c = new Contract();
t.read_data();
t.display_data();
tc.read_data();
tc.display_data();
c.read_data();
c.display_data();
}
}
