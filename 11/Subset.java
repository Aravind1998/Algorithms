import java.util.*;

public class Subset{
        public static int n,d,cnt,flag;
        public static int[] arr,x;

        public static void initialize()
        {
                for(int i=0;i<n;i++)
                {
                        x[i] = -1;
                }
        }

        public static void subset_sum(int s,int k,int sum)
        {
                x[k] = 1;
                if(s + arr[k] == d)
                {
                        flag++;
                        System.out.print("\nSolution" + cnt + ": { ");
                        for(int i=0;i<n;i++)
                                if(x[i]==1)

                                        System.out.print(arr[i] + ", ");
                        System.out.println("\b\b }");
                        cnt++;
                }
                if(k<n-1)
                 {
                if(s + arr[k] + arr[k+1] <=d)
                {
                        subset_sum(s+arr[k],k+1,sum-arr[k]);
                }
                if((s+sum-arr[k]>=d) && (s+arr[k+1]<=d))
                {
                        x[k] = 0;
                        subset_sum(s,k+1,sum-arr[k]);
                }
                }
                x[k]=0;
        }


        public static void main(String[] args)
        {
                System.out.println("Enter the no of elements");
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                arr = new int[n];
                x = new int[n];
                System.out.print("Enter the required numbers in ascending order");
                for(int i=0;i<n;i++)
                {
                        arr[i] = sc.nextInt();
                }
                System.out.println("Required Sum : ");
                  d = sc.nextInt();
                int sum  = 0;
                for(int i=0;i<n;i++)
                {
                        sum += arr[i];
                }
                if(arr[0]>d || sum<d)
                {
                        System.out.println("\nSolution does not exist\n");
                        return;
                }
                else
                {
                        initialize();
                        cnt = 1;
                        flag = 0;
                        subset_sum(0,0,sum);
                }

                if (flag == 0)
                        System.out.println("\nSolution Doesn't Exist\n");
                else
                        System.out.println();
        }
}
