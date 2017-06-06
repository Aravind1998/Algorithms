import java.util.*;
public class Tsp{
        public static void main(String[] args)
        {
                int MAX=100,n,i,j,cost;
                int c[][] = new int[MAX][MAX];
                int tour[] = new int[MAX];
                Scanner sc = new Scanner(System.in);
                System.out.println("How many cities");
                n = sc.nextInt();
                System.out.println("Enter the cost matrix:");
                for(i=0;i<n;i++)
                {
                        for(j=0;j<n;j++)
                        {
                                c[i][j] = sc.nextInt();
                        }
                }
                for(i=0;i<n;i++)
                        tour[i]=i;
                        cost=tsp_dp(c,tour,0,n);
                        System.out.println("Min cost" + cost + "Tour");
                        for(i=0;i<n;i++)
                                System.out.println(tour[i] + "\t");
                        System.out.print("1");
        }
        static int tsp_dp(int c[][],int tour[],int start,int n)
                {
                int i,j,k,MAX=100;
                 int temp[] = new int[MAX];
                int mintour[] = new int[MAX];
                int mincost;
                int ccost;
                if(start==n-2)
                        return c[tour[n-2]][tour[n-1]] + c[tour[n-1]][0];
                mincost = 999;
                for(i = start+1;i<n;i++)
                {
                        for(j=0;j<n;i++)
                        {
                                temp[j] = tour[j];
                                temp[start+1]=tour[i];
                                temp[i]=tour[start+1];
                        }

                        if(c[tour[start]][tour[i]]+(ccost=tsp_dp(c,temp,start+1,n))<mincost)

                                mincost=c[tour[start]][tour[i]]+ccost;
                        for(k=0;k<n;k++)
                                mintour[k] = temp[k];
                }

                for(i=0;i<n;i++)
                        tour[i] = mintour[i];
                return mincost;
        }
}
