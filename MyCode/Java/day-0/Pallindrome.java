// Program for check a number is pallindrome or not.
class Pallindrome
{
public static void main(String ar[])
{
int n=455,r,sum=0,temp;
temp=n;
while(n>0)
{
r=n%10;
n=n/10;
sum=sum*10+r;
}
if(temp==sum)
{
System.out.println("This number is pallindrome");
}
else
{
System.out.println("This is not pallindrome");
}
}
}

