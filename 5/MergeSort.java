import java.util.*;
import java.io.*;
public class merz{
    private static int low=0;
    private static int n=6000;
    private static int high;
    private static int num;
    private static int[] a;
public static void mer(int l,int h,int m){
int i,j,k;
int c[]=new int[num];
i=l;
j=m+1;
k=l;
while(i<=m && j<=h){

if(a[i]<a[j]){

c[k]=a[i];
k++;
i++;
     }
else {

c[k]=a[j];
k++;
j++;
     }
}
while(i<=m){
c[k]=a[i];
k++;
i++;
   }
while(j<=h){
c[k]=a[j];
j++;
k++;
   }
for(k=l;k<=h;k++)
{
        a[k]=c[k];
}
}
public static void mergesort(int l,int h){
     if(l<h){
     int m=(h+l)/2;
     mergesort(l,m);
     mergesort(m+1,h);
     mer(l,m,h);
         }
}

public static void main(String[] args){

         for(int i=1;i<=10;i++){
         System.out.print("\t\t"+num);
         num = n*i;
         a=new int[num];
         Random r=new Random();
         for(int j=0;j<num;j++){
                   a[j]=r.nextInt();
               }
         low=0;
         high=num-1;
         long startTime = System.currentTimeMillis();
         mergesort(low,high);
         long endTime = System.currentTimeMillis();
         long time=endTime-startTime;
         System.out.println(" "+time);
                }
     }
}
