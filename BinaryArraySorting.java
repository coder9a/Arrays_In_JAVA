/**
 * Given a binary array A[] of size N. The task is to arrange the array in increasing order.
 *
 * Note: The binary array contains only 0  and 1.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * A[] = {1,0,1,1,0}
 * Output: 0 0 1 1 1
 * Example 2:
 *
 * Input:
 * N = 10
 * A[] = {1,0,1,1,1,1,1,0,0,0}
 * Output: 0 0 0 0 1 1 1 1 1 1
 */
public class BinaryArraySorting
{
    public static void main(String[] args)
    {
        int a[] = {1,0,1,1,0};
        int n = a.length;
        int i = 0,j=-1;
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                j++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
