/**
 * Given two unsorted arrays arr1[] and arr2[].
 * They may contain duplicates.
 * For each element in arr1[] count elements less than or equal to it in array arr2[].
 *
 * Example 1:
 *
 * Input:
 * m = 6, n = 6
 * arr1[] = {1,2,3,4,7,9}
 * arr2[] = {0,1,2,1,1,4}
 * Output: 4 5 5 6 6 6
 * Explanation: Number of elements less than
 * or equal to 1, 2, 3, 4, 7, and 9 in the
 * second array are respectively 4,5,5,6,6,6
 * Example 2:
 *
 * Input:
 * m = 5, n = 7
 * arr1[] = {4 8 7 5 1}
 * arr2[] = {4,48,3,0,1,1,5}
 * Output: 5 6 6 6 3
 */

import java.util.*;

public class CountingElements
{
    static int BinarySearch(int a[],int i, int j, int x)
    {
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a[mid] <= x)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return j + 1;
    }
//        -----------------------------------------------------
//        if (i == j) {
//            if (x == a[i])
//                return i + 1;
//            else
//                return 0;
//        }
//        else
//            {
//            int mid = (i + j)/2;
//            if (a[mid] >= x && )
//            {
//                return mid+1;
//            }
//            if (x >= a[mid])
//            {
////                Right Side
//                return BinarySearch(a, mid + 1, j, x);
//            }
//            else
//            {
////                Left Side
//                return BinarySearch(a, i, mid-1, x);
//            }
//    }
//        ---------------------------------------------------------
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,7,9};
        int b[] = {0,1,2,1,1,4};
        int n1 = a.length;
        int n2 = b.length;
        Arrays.sort(b);
        int result;
        int n = Math.max(n1,n2);
        for(int i=0;i<n1;i++)
        {
            result = BinarySearch(b,0,n2-1,a[i]);
            System.out.print(result+" ");
        }
    }
}
