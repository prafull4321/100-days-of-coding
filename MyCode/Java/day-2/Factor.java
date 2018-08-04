import java.util.Scanner;
class Factor
{
    public static void main(String ar[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        System.out.println("sum of factors is: "+sum);
    }
}