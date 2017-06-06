import java.util.Scanner;
class Prim {
static int minKey(int key[],Boolean mstSet[],int n){
      int min = 999;
      int index=-1;
      for(int i=0;i<n;i++)
      {
      if(mstSet[i]==false && key[i]<min)
      {
                 min = key[i];
                 index = i;
      }
      }
      return index;
     }
     static void read_graph(int cost[][],int n)
     {
      Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Cost Adjacency matrix:");
         for (int i=0;i<n;i++ ){
             for(int j=0;j<n;j++){
                System.out.println("["+(i+1)+"]["+(j+1)+"]");
        cost[i][j]=sc.nextInt();
         }

     }
 }
     static void printMST(int parent[],int n,int cost[][])
     {
 System.out.println("PARENT\tNODE\tWEIGHT");
     for(int i=1;i<n;i++)
     {
     System.out.println(parent[i]+"     \t"+i+"   \t"+cost[i][parent[i]]);
     }

     }
     static void primProc(int cost[][],int n)
     {
        int parent[] = new int[n];
        int key[] = new int [n];
        Boolean mstSet[] = new Boolean[n];
        // Initialize all keys as INFINITE
        for (int i = 0; i < n; i++)
        {
            key[i] = 999;
            mstSet[i] = false;
        }
        key[0] = 0;
        parent[0] = -1;
        for (int count = 0; count < n-1; count++)
        {
            int u = minKey(key, mstSet,n);
            mstSet[u] = true;
            for (int v = 0; v < n; v++){
                if (cost[u][v]!=0 && mstSet[v] == false && cost[u][v] <  key[v])
                {
 parent[v]  = u;
                    key[v] = cost[u][v];
                }
            }
        }
        printMST(parent, n, cost);
     }
     public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number of Nodes : ");
      int n = sc.nextInt();
         System.out.println();
         int cost[][] = new int[n][n];
         read_graph(cost,n);
         primProc(cost,n);

}
}
