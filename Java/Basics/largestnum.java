//Simple method when u know the numbers

class LargestNumber
{
    public static void main(String[] args)
    {
        int a = 10;
        int b= 20;
        if (a>b)
        {
            System.out.println("a is largest");
        }
        else
        {
            System.out.println("b is largest");
        }
    }
}

//when u take the two numbers from the user

import java.util.Scanner;
class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        int a =r.nextInt();
        int b= r.nextInt();
        if (a>b)
        {
            System.out.println(a +"a is largest");
        }
        else
        {
            System.out.println(b +"b is largest");
        }
    }
}

//largest number in the array from user 

class LargestNumber
{
    public static void main(String[] args)
    {
      int arr[]={23,32,2,54,88};
      int largest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("The largest number of the array"+largest);
    }
}

//largest number in the array from user 

import java.util.Scanner;
class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter  the size of the array");
        int n =r.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=r.nextInt();
        }
        int largest=arr[0];
        for(int i=1;i<n;i++)
        {
            if (arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("The largest number of the array"+largest);
        r.close();
    }
}
