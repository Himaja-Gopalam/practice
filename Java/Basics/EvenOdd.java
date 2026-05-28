import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner r= new Scanner(System.in);
        int num=r.nextInt();
        if (num%2==0)
        {
            System.out.println(" Even number");
        }
        else
        {
            System.out.println("ODD number");
        }
        r.close();
    }
}
