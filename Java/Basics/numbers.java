import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();

        // Method 1
        String a = String.valueOf(num);
        System.out.println(a.length());

        // Method 2
        while(num != 0)
        {
            count += 1;
            num = num / 10;
        }
        System.out.println(count);
    }
}
