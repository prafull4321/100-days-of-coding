import java.util.Scanner;
class StringCopy
{
    public static void strCopy(char source[],char dest[])
    {
        int i=0;
        int n=source.length;
        while(i<n)
        {
            dest[i]=source[i];
            i++;
        } 
        dest[i]='\0';
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char source[]=str.toCharArray();
        int x=str.length(); 
        char dest[]=new char[x+1];
        strCopy(source,dest);
        System.out.println(dest);
    }
}