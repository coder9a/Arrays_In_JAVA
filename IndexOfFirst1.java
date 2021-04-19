/**
 * Given a sorted array consisting 0’s and 1’s.
 * The task is to find the index of first ‘1’ in the given array.
 *
 *
 * Example 1:
 *
 * Input :
 * arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
 * Output :
 * 6
 * Explanation:
 * The index of first 1 in the array is 6.
 *
 *
 * Example 2:
 * Input :
 * arr[] = {0, 0, 0, 0}
 * Output :
 * -1
 * Explanation:
 * 1's are not present in the array.
 */
public class IndexOfFirst1
{
    static long BinarySearch(long a[] , long low, long high)
    {
        while(low <= high)
        {
            int mid = (int) ((low+high)/2);
//            If 1 lies exactly at the center or at the first position in the first attempt
            if(a[mid] == 1 && (mid==0 || a[mid-1] == 0))
                return mid;

//            1 ON RIGHT SIDE
            else if (a[mid]==0)
                low = mid+1;

//            1 ON LEFT SIDE
            else
                high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        long a[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
        int n = a.length;
        long result = BinarySearch(a, 0, n-1);
        System.out.println(result+1);
    }
}
