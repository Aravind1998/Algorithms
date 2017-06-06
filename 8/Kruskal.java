import java.util.Scanner;
class Kruskal{
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args)
        {
                System.out.println("Enter the number of nodes");
                int n = sc.nextInt();
                int cost[][] = new int[n][n];
                Kruskal.input(cost,n);
                Kruskal.compute(cost,n);
        }
        public static void input(int cost[][],int n)
        {
                System.out.println("Enter the cost matrix for the GRAPH");
                for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                                System.out.println("["+i+"]["+j+"] : ");
                                cost[i][j]=sc.nextInt();
                                System.out.println();
                        }
                }
        }
        public static int min_edge(int a[][],int k)
        {
                int small = 999;
                int pos=-1;
                for(int i=0;i<k;i++)
  {
                        if(a[i][2] < small)
                        {
                                small=a[i][2];
                                pos = i;
                        }
                }
                return pos;
        }
        public static int find(int v,int parent[])
        {
                while(parent[v]!=v)
                        v=parent[v];
                return v;
        }
        public static void union(int i,int j,int parent[])
        {
                if(i<j)
                        parent[j]=i;
                else
                        parent[i]=j;
        }
        public static void compute(int cost[][],int n)
        {
                int a[][] = new int[5*n][3];
                int k=0;
                for(int i=0;i<n;i++){
                 for(int j=0;j<n;j++) {
            if(i!=j){
                          a[k][0] =i;
                          a[k][1] = j;
                         a[k][2] = cost[i][j];
                          k++;
                        }
                   }
                }

        int t[][] = new int[k][2];
        int parent[] = new int[n];
        int count = 0;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
                parent[i] = i ;
        }
        int u,v,i,j,pos,m=0;
        while(count != n-1)
        {
                pos = min_edge(a,k);
                if(pos==-1)
                {
                        break;
                }
                u  = a[pos][0];
                v = a[pos][1];
                i = find(u,parent);
                j = find(v,parent);
   if(i!=j)
                {
                        t[m][0]  = u;
                        t[m][1] = v;
                        count++;
                        m++;
                        sum+=a[pos][2];
                        union(i,j,parent);
                }
                a[pos][2] = 999;
        }
        if(count==n-1)
        {
                System.out.println("Spanning tree exists as follows:");
                System.out.println("--------------------------");
                System.out.println("|  U  |  V  |  Distance  |");
                System.out.println("--------------------------");
                for(i=0; i<n-1; i++)
                        System.out.println(t[i][0]+"\t "+t[i][1]+"\t "+cost[t[i][0]][t[i][1]]);
                System.out.println("--------------------------");
                System.out.println("Cost of the spanning tree : "+sum);
        }
        else
                System.out.println("Spanning tree does not exist");
    }
}
