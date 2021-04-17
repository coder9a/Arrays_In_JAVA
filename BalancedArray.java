/**
 * Given an array of even size N,
 * task is to find minimum value that can be added to an element so that array become balanced.
 * An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * arr[] = {1, 5, 3, 2}
 * Output: 1
 * Explanation:
 * Sum of first 2 elements is 1 + 5  = 6,
 * Sum of last 2 elements is 3 + 2  = 5,
 * To make the array balanced you can add 1.
 *
 * Example 2:
 *
 * Input:
 * N = 6
 * arr[] = { 1, 2, 1, 2, 1, 3 }
 * Output: 2
 * Explanation:
 * Sum of first 3 elements is 1 + 2 + 1 = 4,
 * Sum of last three elements is 2 + 1 + 3 = 6,
 * To make the array balanced you can add 2.
 */
public class BalancedArray
{
    public static void main(String[] args)
    {
        long [] a = {1, 5, 3, 2};
        int n = a.length;
        int s1=0,s2=0,p=1;
        for (int i=0;i<n/2;i++)
        {
            s1 = (int) (s1+a[i]);
        }
        for (int i=n/2;i<n;i++)
        {
            s2 = (int) (s2+a[i]);
        }
        int diff = Math.abs(s1-s2);
        System.out.println(diff);
    }
}
