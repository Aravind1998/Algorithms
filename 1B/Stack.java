import java.io.*;
import java.util.*;
public class Stack{
	private int top = -1;
	private int maxSize;
	private int[] stackArray;
	
	public Stack(int s)
	{
		maxSize = s;
		stackArray = new int[maxSize];
	}
	
	public void push(int j)
	{
		stackArray[++top] = j;
	}
	public int pop() {
		return stackArray[top--];
	}
	public boolean isEmpty() {
		return(top==-1);
	}
	public boolean isFull(){
		return(top==maxSize-1);
	}
	public void display()
	{
		System.out.println("Stack =");
		if(isEmpty())
		{
			System.out.println("Empty\n");
			return;
		}	
		for(int i=top;i>=0;i--)
		{
		System.out.println(stackArray[i] + " ");
		System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Integer Stack");
		int n = scan.nextInt();
		char ch;
		Stack stk = new Stack(n);
		do{
            System.out.println("-------------------Stack Operations--------------------");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Stack Underflow");
            System.out.println("4.Stack Overflow");
            System.out.println("5.Display ");
	    System.out.println("Please Enter your choice");
            int choice = scan.nextInt();
            switch (choice)
            { 
		case 1 : if(stk.isFull())
			         System.out.println("Stack Overflow");
			 else{
                		 System.out.println("Enter the element to push into the stack");
                		 stk.push(scan.nextInt() );
                	     }                 
                	     break;                         
            case 2 :    if(stk.isEmpty())
                        System.out.println("Stack Underflow");
                	else
                    	System.out.println("Popped Element is = " + stk.pop());
                	break;
            case 3 :    System.out.println("Empty status = " + stk.isEmpty());
                	break;                
            case 4 :    System.out.println("Full status = " + stk.isFull());
                	break;
            case 5: 	stk.display();
                   	break;
            default :   System.out.println("Wrong Choice ");
                	break;
            }
            System.out.println("\nDo you want to continue (Type 1 or 0)");
            ch = scan.next().charAt(0);
        } while (ch == '1'); 
   }
 }
