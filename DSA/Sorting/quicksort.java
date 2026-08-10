import java.util.*;
public class quicksort 
{
    static void qs(List<Integer> arr,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            qs(arr,low,pi-1);
            qs(arr,pi+1,high);
        }
    
    }
    static int partition(List<Integer> arr,int low,int high)
    
        {
            int pivot=arr.get(low);
            int i=low;
            int j=high;
            while(i<j)
            {
                while(arr.get(i) <= pivot && i<= high-1)
                {
                    i++;
                }
                while(arr.get(j) > pivot && j >= low)
                {
                    j--;
                }
                if(i<j)
                {
                    swap(arr,i,j);
                }
            
            }
            if(i>=j)
            {
                swap(arr,low,j);
                
            }
            return j;
        }
            
        
        
    static void swap(List<Integer> arr,int x,int y)
        {
            int temp=arr.get(x);
            arr.set(x,arr.get(y));
            arr.set(y,temp);
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<Integer>(n);
            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
                
            }
            qs(arr,0,n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr.get(i)+" ");
            }
            sc.close();
        }
        
}
