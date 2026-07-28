class Main 
{
    public static void main(String[] args)
    {
        int n=5;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if ((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println("");
        }

      //pattern2
      
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for (int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }

      //pattern3
      int num=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
      //pattern4
      
        for (int i=1;i<=n;i++)
        {
            for (char j='A';j<'A'+i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("");

      //pattern5 
      
        for (int i=n;i>=1;i--)
        {
        for (char j='A';j < 'A'+i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

      //pattern6 
        char ch='A';
        for (int i=1;i<=n;i++)
        {
        for (char j='A';j < 'A'+i;j++)
            {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println("");
        }
        
        System.out.println("");
        
        //pattern7
        char c='E';
        for (int i=n;i>=1;i--)
        {
        for (char j='A';j < 'A'+i;j++)
            {
                System.out.print(c+" ");
            }
            c--;
            System.out.println("");
        }
        System.out.println("");
    }
}

1 to 10 patterns using functions we can find the patterns in the tuf dsa sheet
    
import java.util.Scanner;

public class  demo 
{
    static void print1(int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print2(int n)
    {
        for (int i = 0; i <= n; i++) 
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print3(int n)
    {
        for (int i = 1; i <= n; i++) 
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j );
            }
            System.out.println();
        }
    }
    static void print4(int n)
    {
        for (int i = 1; i <= n; i++) 
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i );
            }
            System.out.println();
        }
    }
    static void print5(int n)
    {
        for (int i = 1; i <= n; i++) 
        {
            for(int j = 1; j <= n
                -i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print6(int n)
    {
        for (int i = 1; i <= n; i++) 
        {
            for(int j = 1; j <= n
                -i+1; j++)
            {
                System.out.print(j );
            }
            System.out.println();
        }
    }
    static void print7(int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for(int j = 0; j <= n-i-1; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*i+1; j++)   
            {
                System.out.print("*");
            }

            for(int j = 0
                ; j <= n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print8(int n)
    {
        for (int i = 0; i <= n; i++) 
        {
            for(int j = 1; j < i+1; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*n - (2*i+1); j++)   
            {
                System.out.print("*");
            }

            for(int j = 1; j < i+1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print9(int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for(int j = 1; j <= n-i-1; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*i+1; j++)   
            {
                System.out.print("*");
            }

            for(int j = 1; j <= n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++){
    

            for(int j = 1; j < i+1; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0 ; j < 2*n - (2*i+1); j++)   
            {
                System.out.print("*");
            }

            for(int j = 1; j <= i+1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print10(int n)
    {
        for (int i = 1; i <= n; i++) 
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) 
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   // number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            print10(n);
        }
        sc.close();
    }
}
output:

1
01
101
0101
10101
  
1        1
12      21
123    321
1234  4321
1234554321
  
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
  
A 
A B 
A B C 
A B C D 
A B C D E 

A B C D E 
A B C D 
A B C 
A B 
A 

A 
B B 
C C C 
D D D D 
E E E E E 

E E E E E 
D D D D 
C C C 
B B 
A 
