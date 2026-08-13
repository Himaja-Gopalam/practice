import java.util.*;
public class union 
{
    static int[] uni(int[] num1,int[] num2,int n1,int n2)
    {
        int k=0;
        int i=0;
        int j=0;
        int[] union=new int[n1+n2];
        while (i<n1 && j<n2) 
        {
            if(num1[i]<=num2[j])
            {
                if(k==0 || union[k-1]!=num1[i])
                {
                    union[k]=num1[i];
                    k++;
                }
                i++;
            }
            else
            {
                if(k==0 || union[k-1]!=num2[j])
                {
                    union[k]=num2[j];
                    k++;
                }
                j++;
            }
        }
        while(i<n1)
        {
            if(k==0 || union[k-1]!=num1[i])
                {
                    union[k]=num1[i];
                    k++;

                }  
                i++;  
        }
        while(j<n2)
        {
            if(k==0 || union[k-1]!=num2[j])
                {
                    union[k]=num2[j];
                    k++;
                }
                j++;
        }
        return Arrays.copyOf(union,k);
    }
    public static void main(String args[] )
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
        int[] result=uni(num1,num2,n1,n2);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        sc.close();

    }
}
