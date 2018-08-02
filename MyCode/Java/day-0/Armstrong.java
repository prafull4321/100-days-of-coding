//Program for check a number is armstrong number or not
import java.util.Scanner;
class Armstrong 
{
public static void main(String ar[])
{
int sum=0,r,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
n=n/10;
sum=sum+r*r*r;
}
if(temp==sum)
{
System.out.println("This is an armstrong number");
}
else
{
System.out.println("This is not an armstrong number");
}
}
}