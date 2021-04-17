/**
 * Pitsy needs help in the given task by her teacher.
 * The task is to divide a array into two sub array (left and right) containing n/2 elements each
 * and do the sum of the subarrays and then multiply both the subarrays.
 *
 * Example 1:
 *
 * â€‹Input : arr[ ] = {1, 2, 3, 4}
 * Output : 21
 * Explanation:
 * Sum up an array from index 0 to 1 = 3
 * Sum up an array from index 2 to 3 = 7
 * Their multiplication is 21.â€‹â€‹
 *
 * â€‹Example 2:
 *
 * Input : arr[ ] = {1, 2}
 * Output :  2
 */
public class MultiplyLeftRight
{
    public static void main(String[] args)
    {
        int a[ ] = {1, 2, 3, 4};
        int n = a.length;
        int s1=0,s2=0,p=1;
        for (int i=0;i<n/2;i++)
        {
            s1 = s1+a[i];
        }
        for (int i=n/2;i<n;i++)
        {
            s2 = s2+a[i];
        }
        p = s1*s2;
        System.out.println(p);
    }
}
