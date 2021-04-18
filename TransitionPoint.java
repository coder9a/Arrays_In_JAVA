/**
 * Given a sorted array containing only 0s and 1s, find the transition point.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * arr[] = {0,0,0,1,1}
 * Output: 3
 * Explanation: index 3 is the transition
 * point where 1 begins.
 *
 * Example 2:
 *
 * Input:
 * N = 4
 * arr[] = {0,0,0,0}
 * Output: -1
 * Explanation: Since, there is no "1",
 * the answer is -1.
 */
class BinarySearchTPoint
{
    public static int DACBinarySearch(int a[], int n)
    {
        int i=0,j=n-1;
        while(i<=j)
        {
            int mid = (i+j)/2;
            if(a[mid] == 0)
                i = mid+1;
            else if(a[mid] == 1)
            {
                if(mid == 0 || (a[mid-1] == 0) && mid>0)
                {
                    return mid;
                }
                j = mid-1;
            }
        }
        return -1;
    }
}
public class TransitionPoint
{
    public static void main(String[] args)
    {
//        --------------------------------------------------
//        Time Complexity = O(logn)
        int [] a = {0, 0, 0 ,0, 0 ,0 ,0 ,0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1, 1 ,1 ,1 ,1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int n = a.length;
        int x = 1;
        int result = BinarySearchTPoint.DACBinarySearch(a,n);
        System.out.println(result);
//        --------------------------------------------------
//        Time complexity = O(n)
//        int [] a = {0,0,0};
//        int n = a.length;
//        int index = 0;
//        for (int i=0;i<n;i++)
//        {
//            if(a[i] == 1)
//            {
//                index = i;
//                break;
//            }
//            else
//            {
//                index = -1;
//            }
//        }
//        System.out.println(index);
    }
}
