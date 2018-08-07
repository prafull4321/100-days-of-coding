import java.util.Scanner;
class StringCount
{
    public static int letterCount(String s)
    {
        int i=0;
        int l_count=0;
        while(i<s.length())
        {
            if(s.charAt(i) !=' ')
            {
                l_count++;
            }
            i++;
        }
        return l_count;
    }
    public static void main(String ar[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string sentence");
       String s=sc.nextLine();
       int s2=letterCount(s);
       System.out.println(s2);
    }
}