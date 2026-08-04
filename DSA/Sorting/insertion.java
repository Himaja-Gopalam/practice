import java.util.Scanner;
public class insertion 
{
    static void insertionsort(int arr[],int n)
    {
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            
            while(j>0 && arr[j-1]>arr[j])
            {
                // Swap arr[j] and arr[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
                
            }
            
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
        insertionsort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
