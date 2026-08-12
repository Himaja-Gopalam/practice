import java.util.Scanner;
public class linearsearch 
{
    static int ls(int nums[], int target,int n) 
    {
		//Your code goes here
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(ls(nums,target,n));
        sc.close();
    }
}
