import java.util.*;
import java.io.*;

class Customer {
        private String name;
        private String dob;

        public Customer(String name,String dob)
        {
                super();  // Used to invoke parent class constructor
                this.name = name;
                this.dob = dob;
        }

        public Customer()
        { }        // Default constructor provides default values to its objects

        public void read_data(String name,String dob)
        {
                this.name = name;
                this.dob = dob;
        }

        public void display_data()
        {
                StringTokenizer ob = new StringTokenizer(this.dob,"/");
                System.out.print(this.name);
                while(ob.hasMoreTokens())
                {
                        System.out.print("," + ob.nextToken());
                }
                System.out.println();
        }
}


public class Lab2b{
                public static void main(String[] args)
                {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter the name");
                        String name = sc.nextLine();
                        System.out.println("Enter the DOB");
                         String dob = sc.nextLine();
                        Customer customer = new Customer();
                        customer.read_data(name,dob);
                        customer.display_data();
                }
}
