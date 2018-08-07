import java.util.Scanner;
class StringCount1
{
    public static int letterCount(String s)
    {
        return (s.length()-s.split(" ").length) + 1;
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