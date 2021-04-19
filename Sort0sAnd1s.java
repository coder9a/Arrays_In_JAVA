/**
 * Given an array of length N consisting of only 0s and 1s in random order.
 * Modify the array to segregate 0s on left side and 1s on the right side of the array.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * arr[] = {0, 0, 1, 1, 0}
 * Output: 0 0 0 1 1
 *
 * Example 2:
 *
 * Input:
 * N = 4
 * Arr[] = {1, 1, 1, 1}
 * Output: 1 1 1 1
 * Explanation: There are no 0 in the given array,
 * so the modified array is 1 1 1 1.
 */
public class Sort0sAnd1s
{
    public static void main(String[] args)
    {
        int a[] = {0, 0, 1, 1, 0};
        int n = a.length;
        int left=0,right=n-1;
        while(left<right) {
            if (a[left] == 0 && left < right)
            {
                left++;
            }
            if (a[right] == 1 && left < right)
            {
                right--;
            }
            if (a[left] == 1)
            {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        for (int  i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
