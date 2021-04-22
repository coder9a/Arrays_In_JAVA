/**
 * Example 1:
 * Input:
 * N = 6
 * arr[] = {3,0,0,2,0,4}
 * Output:
 * 10
 *
 * Example 2:
 * Input:
 * N = 4
 * arr[] = {7,4,0,9}
 * Output:
 * 10
 * Explanation:
 * Water trapped by above
 * block of height 4 is 3 units and above
 * block of height 0 is 7 units. So, the
 * total unit of water trapped is 10 units.
 *
 * Example 3:
 * Input:
 * N = 3
 * arr[] = {6,9,9}
 * Output:
 * 0
 * Explanation:
 * No water will be trapped.
 */

import java.util.*;
public class TrappingRainWater
{
    public static void main(String[] args)
    {
//        ------------------------------------------------------------------
//        Time Complexity = O(n^2)
//        Space Complexity = O(1)
//        int a[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//        int n = a.length;
//        int left, right,sum=0;
//        for(int i=1;i<n-1;i++)
//        {
//            left = a[i];
//            for(int j = 0; j < i; j++)
//            {
//                left = Math.max(left, a[j]);
//            }
//            right = a[i];
//            for (int j=i+1;j<n;j++)
//            {
//                right = Math.max(right,a[j]);
//            }
//            sum+=Math.min(left,right) - a[i];
//        }
//        System.out.println(sum);
//        ------------------------------------------------------------------
//        Time Complexity = O(n)
//        Space Complexity = O(n)
//        int a[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//        int n = a.length;
//        int result = 0;
//        int [] left_max = new int[n];
//        int [] right_max = new int[n];
//        left_max[0] = a[0];
//        right_max[n-1] = a[n-1];
//        for (int i=1;i<n;i++)
//        {
//            left_max[i] = Math.max(left_max[i-1],a[i]);
//        }
//        for (int i=n-2;i>=0;i--)
//        {
//            right_max[i] = Math.max(right_max[i+1],a[i]);
//        }
//        for (int i=1;i<n-1;i++)
//        {
//            result+=Math.min(left_max[i],right_max[i]) - a[i];
//        }
//        System.out.println(result);
//        ------------------------------------------------------------------
//        Time Complexity = O(n)
//        Space Complexity = O(1)
        int a[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = a.length;
        int sum=0;
        int low = 0;
        int high = n-1;
        int left_max = 0;
        int right_max = 0;
        while(low<=high)
        {
            if(a[low]<a[high])
            {
                if(a[low]>left_max)
                {
                    left_max = a[low];
                }
                else
                {
                    sum+= left_max-a[low];
                }
                low++;
            }
            else
            {
                if(a[high]>right_max)
                {
                    right_max = a[high];
                }
                else
                {
                    sum+= right_max-a[high];
                }
                high--;
            }
        }
        System.out.println(sum);
    }
}
