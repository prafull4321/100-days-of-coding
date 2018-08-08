import java.util.*;
class StringLength
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        //char ch[]=sc.next().toCharArray();
        char arr[]=str.toCharArray();
        strLength(arr); 
    }
        public static void strLength(char arr[])
     {
         int count=0;
               for(char c:arr)
    {
        count++;
    }
    System.out.println("length:"+count);
    }
        }
