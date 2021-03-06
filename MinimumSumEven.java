/**
 * Given an array arr[] of size N,
 * the task is to add the minimum number(should be greater than 0) to the array
 * so that the sum of the array becomes even
 *
 *
 * Example 1:
 *
 * Input: N = 8
 * arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
 * Output:  2
 * Explanation:  Sum of array is 36, so
 * we add minimum number 2 to make the
 * sum even.
 *
 * Example 2:
 *
 * Input: N = 9
 * arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}
 * Output:  1
 */

public class MinimumSumEven
{
    public static void main(String[] args)
    {
        long a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = a.length;
        long sum=0,num;
        for (int i=0;i<n;i++)
        {
            sum = (int) (sum+a[i]);
        }
        if (sum%2==0)
        {
            num =2;
        }
        else
        {
            num = 1;
        }
        System.out.println(num);
    }
}
