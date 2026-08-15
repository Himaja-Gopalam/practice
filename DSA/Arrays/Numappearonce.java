class Solution {
    public int singleNumber(int[] nums,int n)
     {
        //your code goes here
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor=xor^nums[i];
        }
        return xor;
    }
  public static void main(String[] args)
  { 
    Scanner sc=new Scanner(Sytsem.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(singleNumber(a,n));
        sc.close();
  }
}
