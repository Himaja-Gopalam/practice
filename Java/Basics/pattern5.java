class Main
{
    public static void main(String[] args) 
    {
        int n = 5;
        for (int i=n;i>=1;i--)
        {
            char a=(char)('A'+i-1);
            for (int j =1;j<=i;j++)
            {
                System.out.print(a);
            }
            System.out.println();
        }  
      for (int i=1;i<=n;i++)
        {
            char a=(char)('A'+i-1);
            for (int j =1;j<=i;j++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
        \\pattern 3

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(char a='A';a<'A'+i;a++)
            {
                System.out.print(a);
            }
        
            for(char a=(char)('A'+ i -2);a>='A';a--)
            {
                System.out.print(a);
            }
            System.out.println(" ");
        }

        //pattern4

        for(int i=n;i>=1;i--)
        {
            for(char a=(char)('A'+i-1);a<='A'+n-1;a++)
            {
                System.out.print(a+" ");
            }
            System.out.println("");
        }
        //pattern 5 & 7
        for(int i=n;i>=1;i--)
        { 
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 6

        for(int i=1;i<=n;i++)
        { 
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

outputs
  
EEEEE
DDDD
CCC
BB
A

A
BB
CCC
DDDD
EEEEE

    A 
   ABA 
  ABCBA 
 ABCDCBA 
ABCDEDCBA 

E 
D E 
C D E 
B C D E 
A B C D E

**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

****
*  *
*  *
****
