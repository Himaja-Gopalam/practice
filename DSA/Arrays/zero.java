import java.util.Scanner;

public class zero 
{
    static int[] myopt(int arr[],int n)
    {
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=0)
            {
                arr[i]=arr[j];
                i++;
            }

        }
        for(int k=i;k<n;k++)
        {
            arr[k]=0;
        }
    return arr;

    }
    static int[] moveZeroes(int[] nums)
    {
        int n=nums.length;
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                temp[j]=nums[i];
                j++;
            }
        }
        
        for(int i=0;i<=j;i++)
        {
           nums[i]=temp[i];
        }
        for(int i=j;i<n;i++)
        {
            nums[i]=0;
        }
        return nums;

    }
   static int[] opt(int arr[],int n)
    {
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        if (j==-1)
        {
            return arr;
        }
        for(int k=j+1;k<n;k++)
        {
            if(arr[k]!=0)
            {
            swap(arr,k,j);
            j++;
            }
        }
    return arr;

    }
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
        arr=opt(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
