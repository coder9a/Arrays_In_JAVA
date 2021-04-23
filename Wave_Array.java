/**
 * Given a sorted array arr[] of distinct integers.
 * Sort the array into a wave-like array and return it.
 * In other words, arrange the elements into a sequence
 * such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
 *
 * Example 1:
 * Input:
 * n = 5
 * arr[] = {1,2,3,4,5}
 * Output: 2 1 4 3 5
 * Explanation: Array elements after
 * sorting it in wave form are
 * 2 1 4 3 5.
 *
 *
 * Example 2:
 * Input:
 * n = 6
 * arr[] = {2,4,7,8,9,10}
 * Output: 4 2 8 7 10 9
 * Explanation: Array elements after
 * sorting it in wave form are
 * 4 2 8 7 10 9.
 */
public class Wave_Array
{
    public static void main(String[] args)
    {
        int [] arr = {2,4,7,8,9,10};
        int n,i,temp;
        n = arr.length;
        for (i=0;i<n-1;i+=2)
        {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
