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
