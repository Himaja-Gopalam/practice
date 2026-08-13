import java.util.*;
public class inter 
{
     public static void intersections(int arr1[], int arr2[],int a,int b) 
     { 
         
         int i=0; 
         int j=0;
         int k=0; 
         int[] re=new int[a+b]; 
         while(i<a && j< b) {
             if(arr1[i]<arr2[j]) 
                { 
                    i++; 
                } 
            else if(arr2[j]<arr1[i]) 
                { 
                    j++; 
                } 
            else{ 
                re[k]=arr1[i]; 
                i++;
                 j++; 
                 k++;
                } 
            } 
            for(int h=0;h<k;h++) 
                {
                     System.out.print(re[h]+" "); 
                    }
            
                 } 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] num1=new int[n1];
        for(int i=0;i<n1;i++)
        {
            num1[i]=sc.nextInt();
        }
        int[] num2=new int[n2];
        for(int i=0;i<n2;i++)
        {
            num2[i]=sc.nextInt();
        }
        intersections(num1,num2,n1,n2);
        
        sc.close();
    }
}
