import java.util.Scanner;
public class missingnumber 
{
    static int mi(int[] a,int n)
    {
        for(int i=1;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==i)
                {
                    flag=1;
                    break;
                }
            }
        if(flag==0)
             
                return i;
            
        }
        return -1;
    }
    static int mibe(int[] a,int n)
    {
        int[] hash=new int[n+1];
        
        for(int j=0;j<n;j++)
        {
            hash[a[j]]=1;
        }
        for(int i=0;i<n;i++)
        {
            if(hash[i]==0)
            {
                return i;
            }
        }
        
        return -1;
    }
    static int miop(int[]a ,int n)
    {
        int sum=n*(n+1)/2;
        int s2=0;
        for(int i=0;i<n;i++)
        {
            s2+=a[i];
        }

        return (sum-s2);
    }
    static int miop2(int[]a ,int n)
    {
        int xor1=0;
        int xor2=0;
        
        for(int i=0;i<n;i++)
        {
            xor1=xor1^i;
            xor2=xor2^a[i];
        }
        xor1=xor1^n;
        return xor1^xor2;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(miop2(a,n));
        sc.close();
    }
}
