import java.util.*;
class PairNumber
{
    public static void pairNumber(int arr[],int diff,int size)
    {
        int count=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(Math.abs(arr[i]-arr[j])==diff)
                {
                    count++;
                }
            }
        }
        System.out.println("number of same pair difference:"+count);
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of an array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j:arr)
        {
            System.out.print(j+" ");
        }
        System.out.println("\nEnter difference");
        int diff=sc.nextInt();
        pairNumber(arr,diff,size);
    }
}