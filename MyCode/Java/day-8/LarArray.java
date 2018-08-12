import java.util.Scanner;
class LarArray
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=sc.nextInt();
        }
        for(int j:arr)
        {
            System.out.print(j+" ");
        }
        int largest=0;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
               largest=arr[i];
            }
        }
        System.out.println("\nlarger elemnet is:"+largest);
    }
}