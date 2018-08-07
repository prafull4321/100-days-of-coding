class Selection
{
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index])
                {
                      index = j;
                }
            }
                int smallestElement=arr[index];
                arr[index]=arr[i];
                arr[i]=smallestElement;
        }
    }
    public static void main(String ar[])
    {
        int arr[]={11,2,8,9,3,7,4};
        System.out.println("Before sort:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        selectionSort(arr);
        System.out.println("\nafter sort:");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}