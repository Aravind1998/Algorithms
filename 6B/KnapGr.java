import java.util.*;

class KnapGr{
private static float capacity;
private static float weight[];
private static float profit[];
private static int n;
public static void knapsack(){
       float x[]=new float[n];
       float tp=0;
       float c=capacity;int i;
       for(i=0;i<n;i++)
       {x[i]=0;}
       for(i=0;i<n;i++){
          if(c<weight[i])
               break;
           else{
                tp+=profit[i];
                x[i]=1;
                c=c-weight[i];
            }
       }
       if(i<n)
            {
                 x[i]=c/weight[i];
             }
            tp+=x[i]*profit[i];
        System.out.println("the vector:");
          for(int j=0;j<n;j++){   
            System.out.println(x[j]);
        }
        System.out.println("total profit:"+tp);

}
public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter the number of items :");
   n= in.nextInt();
   weight=new float[n];
   profit=new float[n];
   System.out.println("enter the capacity :");
   capacity= in.nextFloat();
   for(int i=0;i<n;i++) {
   System.out.println("enter the weight and profit :");
   weight[i]= in.nextFloat();
   profit[i]= in.nextFloat();
   }
   float ratio[]=new float[n];
   for(int i=0;i<n;i++){
          ratio[i]=profit[i]/weight[i];
    }
  for (int i=0;i<n;i++)
    {
         for (int j=i+1;j<n;j++)
          {
              if(ratio[i]<ratio[j])
                {
                   float t=ratio[i];
                   ratio[i]=ratio[j];
                   ratio[j]=t;
	           t=weight[i];
                   weight[i]=weight[j];
                   weight[j]=t;
	           t=profit[i];
                   profit[i]=profit[j];
                   profit[j]=t;

                 }                
          }
     }
      for(int i=0;i<n;i++)
           System.out.println(weight[i]);
     knapsack();
}
}
