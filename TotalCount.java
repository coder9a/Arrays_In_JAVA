/**
 * Given an array Arr of N positive integers and a number K
 * where K is used as a threshold value to divide each element of the array into sum of different numbers.
 * Find the sum of count of the numbers in which array elements are divided.
 *
 * Example 1:
 *
 * Input:
 * N = 4, K = 3
 * Arr[] = {5, 8, 10, 13}
 * Output: 14
 * Explanation: Each number can be expressed as sum
 * of different numbers less than or equal to K as
 * 5 (3 + 2), 8 (3 + 3 + 2), 10 (3 + 3 + 3 + 1),
 * 13 (3 + 3 + 3 + 3 + 1). So, the sum of count
 * of each element is (2+3+4+5)=14.
 *
 * Example 2:
 *
 * Input:
 * N = 5, K = 4
 * Arr[] = {10, 2, 3, 4, 7}
 * Output: 8
 * Explanation: Each number can be expressed as sum of
 * different numbers less than or equal to K as
 * 10 (4 + 4 + 2), 2 (2), 3 (3), 4 (4) and 7 (4 + 3).
 * So, the sum of count of each element is
 * (3 + 1 + 1 + 1 + 2) = 8.
 */
public class TotalCount
{
    public static void main(String[] args)
    {
//        ---------------------------------------------------
//        Time Complexity = O(n)
        int a[] = {5, 8, 10, 13};
        int n = a.length;
        int k=3, sum=0;
        for (int i=0;i<n;i++)
        {
            if(a[i]%k == 0)
            {
                sum = sum + a[i]/k;
            }
            else
            {
                sum = sum + (a[i]/k) + 1;
            }
        }
        System.out.println(sum);
//        ----------------------------------------------------
//        Time Complexity = O(n^2)
//        int a[] = {10, 2, 3, 4, 7};
//        int n = a.length;
//        int k=4, count=0, sum=0;
//        for (int i=0;i<n;i++)
//        {
//            while (a[i]!=0)
//            {
//                if(a[i]<k)
//                {
//                    a[i] = 0;
//                    count++;
//                }
//                else
//                {
//                    a[i] = a[i]-k;
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
    }
}
