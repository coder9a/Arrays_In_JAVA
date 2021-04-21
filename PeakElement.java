/**
 * A peak element in an array is the one that is not smaller than its neighbours.
 * Given an array of size N, find the index of any one of its peak elements.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * arr[] = {1,2,3}
 * Output: 2
 * Explanation: index 2 is 3.
 * It is the peak element as it is
 * greater than its neighbour 2.
 *
 *
 * Example 2:
 *
 * Input:
 * N = 2
 * arr[] = {3,4}
 * Output: 1
 * Explanation: 4 (at index 1) is the
 * peak element as it is greater than
 * its only neighbour element 3.
 */
class PeakElement
{
    static int SearchPeak(int a[], int n)
    {
        if(n==1)
            return 0;
        if (a[0] > a[1])
            return a[0];
        if (a[n - 1] > a[n - 2])
            return a[n - 1];
        for (int i=0;i<n-2;i++)
        {
            if (a[i] < a[i + 1] && a[i + 1] > a[i + 2])
                return a[i + 1];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int a[] = {10, 20, 15, 2, 23, 90, 67};
        int n = a.length;
        int result = SearchPeak(a,n);
        System.out.println("Element is : "+(result));
    }
}