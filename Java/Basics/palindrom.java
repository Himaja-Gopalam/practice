//palindrome or not
public class recursion
{
static Boolean pali(int i,String s)
    {
        if(i>=s.length()/2)
            return true;
        if (s.charAt(i) != s.charAt(s.length()-1-i))
            return false;
        return pali(i+1,s);
    }
public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pali(0,s));
    }
}
