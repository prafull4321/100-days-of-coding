// Fing the poasition of digit in a number
import java.util.Scanner;
class Position
{
    public static void main(String ar[])
    {
        int position=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Eneter digit which you want to search");
        int digit=sc.nextInt();
        if(digit<0)
        {
            System.out.println("-1");
        }
        if(digit>9)
        {
            System.out.println("-2");
        }
        while(num!=0)
        {
            int rem =num % 10;
            if(rem==digit)
            break;
            num=num/10;
            position=position*10;
        }
        System.out.println("postion of digit is:"+position);
    }
}