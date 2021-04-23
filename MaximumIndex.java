/**
 * Given an array A[] of N positive integers.
 * The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].
 *
 *
 * Example 1:
 *
 * Input:
 * N = 2
 * A[] = {1, 10}
 * Output:
 * 1
 * Explanation:
 * A[0]<=A[1] so (j-i) is 1-0 = 1.
 * Example 2:
 *
 * Input:
 * N = 9
 * A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
 * Output:
 * 6
 * Explanation:
 * In the given array A[1] < A[7]
 * satisfying the required
 * condition(A[i] <= A[j]) thus giving
 * the maximum difference of j - i
 * which is 6(7-1).
 */
public class MaximumIndex
{
    public static void main(String[] args)
    {
        int [] arr = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int i, j,n,c=0,maxc=Integer.MIN_VALUE;
        n = arr.length;
//  -------------------------------------------------------------------
//        Time Complexity is O(n^2) ----->>> Brute Force Method
//        for (i=0;i<n;i++)
//        {
//            for (j=i+1;j<n;j++)
//            {
//                if(arr[j]>arr[i])
//                {
//                    c = j-i;
//                    maxc = Math.max(maxc,c);
//                }
//            }
//        }
//        System.out.println(maxc);
//  -------------------------------------------------------------------
//          Time Complexity is O(n)
        j=n;
        for(i=0;i<n;i++)
        {
            if(arr[j--]>arr[i])
            {
                c = j-i;
                maxc = Math.max(maxc,c);
            }
        }
        System.out.println(maxc);
    }
}
