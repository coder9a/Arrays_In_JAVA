/**
 * Given an array of integers. Check whether it contains a triplet that sums up to zero.
 *
 * Example 1:
 *
 * Input: n = 5, arr[] = {0, -1, 2, -3, 1}
 * Output: true
 * Explanation: 0, -1 and 1 forms a triplet
 * with sum equal to 0.
 *
 * Example 2:
 *
 * Input: n = 3, arr[] = {1, 2, 3}
 * Output: false
 * Explanation: No triplet with zero sum exists.
 *
 */

import java.util.Arrays;

public class TripletZeroSum
{
    public static void main(String[] args)
    {
        int a []= {0, -1, 2, -3, 1};
        Arrays.sort(a);
        int n = a.length;
        for (int i=0;i<n;i++)
        {
            int l = i+1;
            int r = n-1;
            int x = a[i];
            while (l<r)
            {
                if(x+a[l]+a[r] == 0)
                {
                    System.out.println(x+" "+a[l]+" "+a[r]);
                    l++;
                    r--;
                }
                else if(x+a[l]+a[r] < 0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
    }
}
