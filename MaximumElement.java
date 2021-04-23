/**
 * Given an array A[] of size n. The task is to find the largest element in it.
 *
 * Example 1:
 *
 * Input:
 * n = 5
 * A[] = {1, 8, 7, 56, 90}
 * Output:
 * 90
 * Explanation:
 * The largest element of given array is 90.
 */
public class MaximumElement
{
    public static void main(String[] args)
    {
        int [] a = {1, 8, 7, 56, 90};
        int max = a[0];
        int n = a.length;
        for(int i=1;i<n;i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum element = "+max);
    }
}
