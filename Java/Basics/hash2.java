import java.util.*;
public class hash2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //precomputation
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int count = hash.getOrDefault(arr[i], 0);
            hash.put(arr[i], count + 1);
        }

        int q=sc.nextInt();
        while(q-->0)
        {
            int num=sc.nextInt();
            //fetch
            System.out.println(hash.get(num));
        }
        sc.close();
    }
}
