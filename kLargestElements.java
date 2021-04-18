/**
 * Given an array Arr of N positive integers, find K largest elements from the array.
 * The output elements should be printed in decreasing order.
 *
 * Example 1:
 *
 * Input:
 * N = 5, K = 2
 * Arr[] = {12, 5, 787, 1, 23}
 * Output: 787 23
 * Explanation: 1st largest element in the
 * array is 787 and second largest is 23.
 * Example 2:
 *
 * Input:
 * N = 7, K = 3
 * Arr[] = {1, 23, 12, 9, 30, 2, 50}
 * Output: 50 30 23
 * Explanation: 3 Largest element in the
 * array are 50, 30 and 23.
 */
import java.util.*;

public class kLargestElements
{
    public static void main(String[] args)
    {
        int a[] = {12, 5, 787, 1, 23};
        Arrays.sort(a);
        int n=a.length;
        int k=2,j=0;
        int [] newArr = new int[k];
        for (int i=n-1;i>n-1-k;i--)
        {
            newArr[j++] = a[i];
        }
        for (j=0;j<k;j++)
        {
            System.out.println(newArr[j]);
        }
    }
}
