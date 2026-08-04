import java.util.Scanner;
public class bubble 
{
static void bubblesort(int arr[],int n)
    {   
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-i-2;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
    }
}
static void optbubble(int arr[],int n)
{
    for(int i=n-1;i>=1;i--)
    {
        int flag=0;
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                }
            }
        if(flag==0)
        {
            System.out.println("Array is already sorted");
            break;
        }
    }
}
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int n=sc.nextInt();
 int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    optbubble(arr,n);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();   
}
}
