import java.util.Scanner;
class CharCount
{
    public static int charCount(String str,char ch)
    {
        int i=0;
        int count=0;
        while(i<str.length())
        {
            if(str.charAt(i) == ch)
            {
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("enter character to count number");
        char c=sc.next().charAt(0);
        int n=charCount(str,c);
        System.out.println("no of character is:"+n);
    }
}