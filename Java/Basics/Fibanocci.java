//multiple function calls
//faibocci program
static int  fib(int n)
{
    if(n<=1)
        return n;
    int last=fib(n-1);
    int slat=fib(n-2);
    return last + slat;
}
public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
   
