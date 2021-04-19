/**
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * arr[]= {0 2 1 2 0}
 * Output:
 * 0 0 1 2 2
 * Explanation:
 * 0s 1s and 2s are segregated
 * into ascending order.
 * Example 2:
 *
 * Input:
 * N = 3
 * arr[] = {0 1 0}
 * Output:
 * 0 0 1
 * Explanation:
 * 0s 1s and 2s are segregated
 * into ascending order.
 */
public class Sort0s1sAnd2s
{
    public static void main(String[] args)
    {
        int a[]= {0, 2, 1, 2, 0};
        int n = a.length,temp;
        int low = 0, mid = 0, high = n-1;
        while(mid<=high)
        {
            if(a[mid] == 0)
            {
                temp = a[mid];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            if(a[mid] == 1)
            {
                mid++;
            }
            if(a[mid] == 2)
            {
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                mid++;
                high--;
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
