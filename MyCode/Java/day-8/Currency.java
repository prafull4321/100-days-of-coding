import java.util.Scanner;
class Currency
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your currency");
        int amount=sc.nextInt();
        int temp;
        temp=amount;
        int [] arr={50,20,10,5};
        for(int i=0;i<arr.length;i++)
        {   
            System.out.println("currency "+arr[i]+" is: "+temp/arr[i]);
            temp=temp % arr[i];
        } 
    }
}