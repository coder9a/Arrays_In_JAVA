/**
 * Given an array arr[] of size N representing the size of candles which reduce by 1 unit each day.
 * The room is illuminated using the given N candles.
 * Find the maximum number of days the room is without darkness.
 *
 *
 * Example 1:
 *
 * Input: N = 3, arr[] = {1,1,2}
 * Output: 2
 * Explanation: The candles' length reduce
 * by 1 in 1 day. So, at the end of day 1:
 * Sizes would be 0 0 1, So, at end of
 * day 2: Sizes would be 0 0 0. This means
 * the room was illuminated for 2 days.
 *
 * Example 2:
 *
 * Input: N = 5, arr[] = {2,3,4,2,1}
 * Output: 4
 */
public class FightingDarkness
{
    public static void main(String[] args)
    {
        long a[] = {2,3,4,2,1};
        int n = a.length;
        long maxCandle = a[0];
        for(int i=1;i<n;i++)
        {
            maxCandle = Math.max(maxCandle, a[i]);
        }
        System.out.println(maxCandle);
    }
}
