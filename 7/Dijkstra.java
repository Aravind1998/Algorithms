import java.util.Scanner;

public class Dijkstra {

public static int[][] cost;
public static int n, source;
public static int[] distance, visited, parent;

public static void read() {
Scanner sc = new Scanner(System.in);
for ( int i = 0; i < n; i++) {
for ( int j = 0; j < n; j++) {
System.out.print((i+1) + "\t" + (j+1) + "\t\t");
cost[i][j] = sc.nextInt();
}
}
}

public static void dijkstra_method() {
for (int u = 0; u < n; u++) {
distance[u] = cost[source][u];
visited[u] = 0;
parent[u] = source;
}
visited[source] = 1;
for (int i = 0; i < n; i++) {
int min = 999;
int src = -1;
for (int j = 0; j < n; j++) {
if (visited[j] == 0 && distance[j] < min) {
min = distance[j];
src = j;
}
}
if (src == -1)
return ;
else {
visited[src] = 1;
for (int b = 0; b < n; b++) {
if (visited[b] == 0 && (distance[src] + cost[src][b]) < distance[b]) {
distance[b] = distance[src] + cost[src][b];
parent[b] = src;
}
}
}
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("\nWELCOME\n\nEnter:-\n Number of Vertices: ");
n = sc.nextInt();
cost = new int[n][n];
System.out.print(" Source Vertex: ");
source = sc.nextInt() - 1;
distance = new int[n];
visited = new int[n];
parent = new int[n];
System.out.println("\nEnter Cost:-\nSource\tDestination\tCost");
read();
dijkstra_method();
System.out.println("\n\nShortest Distance:-");
for (int i = 0; i < n; i++) {
System.out.print("\n Vertex " + (source + 1) + " to Vertex " + (i + 1) + ":-\n  ");
if (distance[i] >= 999)
System.out.println(" Not Reachable");
else {
int k = i;
while (k != source) {
System.out.print(" " + (k + 1) + " :");
k = parent[k];
}
System.out.println(" " + (k + 1) + " = " + distance[i]);
}
}
}
}
