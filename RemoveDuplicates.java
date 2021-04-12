public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int [] arr = {2, 2, 2, 2, 2,3,3,3,4,4,5,5};
        int len = arr.length,i;
        int j=0;
        int [] arr2 = new int[len];
        for (i=0;i<len-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr2[j++] = arr[i];
            }
        }
        arr2[j++] = arr[len-1];
        for (i=0;i<j;i++)
        {
            arr[i] = arr2[i];
        }
        for (i=0;i<j;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
