import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
               System.out.print("*"); 
            }
        System.out.println();
        }
        System.out.println();
      
        //pattern2
        for (int i=n;i>=1;i--)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
               System.out.print("*"); 
            }
        System.out.println();
        }
      
      //pattern3
      for (int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
               System.out.print("*"); 
            }
        System.out.println();
        }
        for (int i=n-1;i>=1;i--)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
               System.out.print("*"); 
            }
        System.out.println();
        }
      //pattern4
      for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
output 
5
    *
   ***
  *****
 *******
*********

*********
 *******
  *****
   ***
    *
  
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*
**
***
****
*****
****
***
**
*
