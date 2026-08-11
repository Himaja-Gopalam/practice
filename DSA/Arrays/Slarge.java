import java.util.*;
public class Slarge 
{
    static int smax(int[] arr,int n)
    {
        int max=arr[0];
        int semax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                semax=max;
                max=arr[i];
            }
            if(arr[i]>semax && arr[i]<max)
            {
                semax=arr[i];
            }
        }
        return semax;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=smax(arr,n);
        System.out.println(result);
        sc.close();

    }
}
