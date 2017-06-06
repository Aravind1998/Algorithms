import java.util.*;
import java.lang.Exception;

class SquareGenerator implements Runnable
{
public int y;
SquareGenerator(int num)
{
this.y = num;
}
public void run()
{
System.out.println("Square of the number "+y+" is : "+(y*y));
}
}
class CubeGenerator implements Runnable
{
public int y;
CubeGenerator(int num)
{
this.y = num;
}
public void run()
{
System.out.println("Cube of the number "+y+" is : "+(y*y*y));
}
}
class RandomNumber extends Thread
{
public void run()
{
int n;
Scanner sc = new Scanner(System.in);
            System.out.println("Enter the required number of Test Cases : ");
            n = sc.nextInt();
            for(int i=1;i<=n;i++) {
        try {
Random r = new Random();
int num = r.nextInt(100);
System.out.println("The Random Number generated is :    "+num);
Thread t2 = new Thread(new Square(num));
t2.start();
Thread t3 = new Thread(new Cube(num));
t2.sleep(500);
t3.start();
t3.sleep(500);
}catch(InterruptedException e){
            System.out.println(e);
         }
    }
}
}
class MulThread
{
public static void main(String[] args)
{
int num;
RandomNumber R = new RandomNumber();
R.start();
}
}
