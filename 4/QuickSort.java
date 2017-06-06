import java.util.*;
public class Quick{
public static int n = 5000;
public static int[] a;
public static int num;

public static int partition(int left, int right) {
int pivot = a[left];
int i = left;
int j = right + 1;
int temp;
while (i < j) {
do {
i++;
}while (a[i] <= pivot && i < right);
do {
j--;
}while (a[j] > pivot && j > left);
if (i < j){
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
if (left < right) {
temp = a[left];
a[left] = a[j];
a[j] = temp;
}
return j;
}

public static void Quick(int left, int right) {
if (left < right) {
int pivot = partition(left, right);
Quick(left, pivot - 1);
Quick(pivot + 1, right);
}
}

public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
num = n * i;
System.out.print(num + "\t");
a = new int[num];
Random r = new Random();
for (int j = 0; j < num; j++) {
a[j] = r.nextInt(25);
}
long start = System.currentTimeMillis();
Quick(0, num - 1);
long end = System.currentTimeMillis();
System.out.println(end - start);
}
}
}
