import java.util.Scanner;
public class recursion
{  
    static int c=0;
static void fun1(int n)
    {
        if(c==n)
            return;
        System.out.println("Himaja");
        c++;
        fun1(n);
    }
static void fun2(int i, int n)
    {
        if(i>n)
            return;
        System.out.println("Himaja");
        fun2(i+1,n);
    }
static void fun3(int i, int n)
    {
        if(i>n)
            return;
        System.out.println(i);
        fun3(i+1,n);
    }
static void fun4(int i, int n)
    {
        
        if(n<i)
            return;
        System.out.println(n);
        fun4(i,n-1);
        
    }
static void fun5(int i, int n)
    {
        if(i<1)
            return;
        fun5(i-1,n);
        System.out.println(i);
        
    } 
static void fun6(int i, int n)
    {
        if(i>n)
            return;
        fun6(i+1,n);
        System.out.println(i);
        
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // or however many times you want to print
        fun6(1,n);
        sc.close();
    }
    
}
