import java.util.Scanner;
import java.util.HashMap;
public class twosum 
{
    static String m1(int[] a,int n,int target)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=a[i]+a[j];
                if(sum==target)
                {
                    return"YES";
                }
            }
        }

        return "NO";
    }
    static String m2(int[] a,int n,int target) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num=a[i];
            int more=target-num;
            if(map.containsKey(more))
            {
                return "YES";
            }
            map.put(num,i);
        }
        return "NO";
    }
    static String op(int[] a,int n,int target)
    {
        int left=0;
        int right=n-1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=a[left]+a[right];
            if(sum==target)
            {
                return "YES";
            }
            else if(sum>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }

        return "NO";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(op(a,n,target));
        sc.close();
    }
}
