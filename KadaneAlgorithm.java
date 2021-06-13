/**
 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which
 * is a contiguous subarray.
 * Example 2:
 *
 * Input:
 * N = 4
 * arr[] = {-1,-2,-3,-4}
 * Output:
 * -1
 * Explanation:
 * Max subarray sum is -1
 * of element (-1)
 */
public class KadaneAlgorithm
{
    public static void main(String[] args)
    {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        int start=0, end=0;
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max_ending_here = max_ending_here+arr[i];
            if(max_ending_here<arr[i])
            {
                max_ending_here = arr[i];
                start = i;
            }
            if (max_so_far<max_ending_here)
            {
                max_so_far = max_ending_here;
                end = i;
            }
        }
        System.out.println("Maximum sum is : "+max_so_far);
        System.out.print("Contigous subarray is : ");
        for (int i = start;i<=end;i++)
            System.out.print(arr[i]+" ");
    }
}
