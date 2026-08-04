import java.util.Scanner;
public class selection_sort 
{
    static void selectionsort(int arr[],int n)
    {
        for(int i=0;i<=n-2;i++)
        {
            int min=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            // Swap the found minimum element with the first element
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        selectionsort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
