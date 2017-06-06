import java.util.*;

class Ham
{
static int count = 0;
public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of vertices :");
n = sc.nextInt();
int a[][] = new int[n][n];
System.out.println("Enter adjacency matrix :");
for(int i = 0; i < n; i++)
{
for(int j = 0; j < n; j++)
{
a[i][j] = sc.nextInt();
}
}
int visited[] = new int[n];
int vertex = 0;
int path[] = new int[n];
Hamilton(0, path, vertex, a, visited, n);
if(count == 0)
{
System.out.println("Cycle does not exist");
}
}
public static void Hamilton(int j, int path[], int vertex, int a[][], int visited[], int n)
{
path[j] = vertex + 1;
j++;
visited[vertex] = 1;
int flag = 0;
for(int i = 0; i < n; i++)
{
if(visited[i] != 1)
{
flag = 1;
break;
}
}
if(flag == 0)
{
if(a[vertex][0] == 1)
{
System.out.println("Cycle Exist\nPath is:");
for(int i = 0; i < n; i++)
{
System.out.print("\t" + path[i]);
}
System.out.println("");
count++;
}
}
for(int i = 0; i < n; i++)
{
if(visited[i] == 0 && a[vertex][i] == 1)
{
int visited2[] = new int[n];
for(int k = 0; k < n; k++)
{
visited2[k] = visited[k];
}
Hamilton(j, path, i, a, visited, n);
for(int k =0; k < n; k++)
{
visited[k] = visited2[k];
}
}
}
}
}
