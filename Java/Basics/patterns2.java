class Main
{
    public static void main(String[] args) 
    {    
        int n=5;
        int i=n;
        for (i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); 
        
        for (i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        
        for (i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(); 
        
        for (i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }  
}

output:
  
*****
****
***
**
*

55555
4444
333
22
1

12345
1234
123
12
1

54321
4321
321
21
1
