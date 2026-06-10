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
