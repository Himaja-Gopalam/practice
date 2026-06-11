class Main
{
    public static void main(String[] args) 
    {    
        int n=5;
        int i=1;
        while(i<=n)
        {
            System.out.println("* * * * *");
            i++;
        }
        System.out.println(); 
        
        for (int j=1;j<=n;j++)
        {
            for(int k=1;k<=j;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(i=1;i<=n;i++ )
        {  
           for (int z=1;z<=i;z++)
           {
            System.out.print(z);
           }
        System.out.println();
        }
        System.out.println();
        
        for(i=1;i<=n;i++ )
        {  
           for (int z=1;z<=i;z++)
           {
            System.out.print(i);
           }
        System.out.println();
        }
    }  
}

outputs:

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*
**
***
****
*****

1
12
123
1234
12345

1
22
333
4444
55555
