import java.util.Scanner;
class KnapsDp{
    static int max(int a, int b) { return (a > b)? a : b; }
    static int knapSack(int W, int wt[], int val[], int n)
    {
         int i, w;
     int K[][] = new int[n+1][W+1];
     for (i = 0; i <= n; i++){
         for (w = 0; w <= W; w++){
             if (i==0 || w==0)
                  K[i][w] = 0;
             else if (wt[i-1] <= w)
                   K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
             else
                   K[i][w] = K[i-1][w];
         }
      }
      for(int k=0;k<=n;k++){
        for(int j=0;j<=W;j++){
            System.out.print("\t"+ K[k][j]);
            }
        System.out.print("\n");
        }
        return K[n][W];
    }
    public static void main (String[] args) {
        int[] value = new int [10];
        int[] weight = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:\n Total Capacity: ");
        int Total = sc.nextInt();
        System.out.print(" Enter the Number of Items: ");
        int n = sc.nextInt();
        System.out.println("\nEnter the Weight and Value for each Item:\n");
        for (int i = 0; i < n; i++) {
            System.out.println(" Weight: ");
            weight[i] = sc.nextInt();
            System.out.println("Value: ");
            value[i] = sc.nextInt();
        }
        System.out.println("\nMaximum Value = " + knapSack(Total, weight,value,n));
    }
}
