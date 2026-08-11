import java.util.Scanner;
public class dupli 
{
    static int[] re(int[] arr,int n)
    {
        int temp=arr[0];
        for(int i=1;i<=n-1;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        re(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
