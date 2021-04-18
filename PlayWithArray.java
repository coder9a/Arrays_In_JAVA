/**
 * Given an unsorted array arr of size N,
 * rearrange the elements of array such that number at the odd index is
 * greater than the number at the previous even index.
 * The task is to complete the function formatArray() which will return formatted array.
 *
 * NOTE:
 * If the array formed is according to rules print 1, else 0.
 *
 * Example 1:
 *
 * Input:
 * n = 5
 * arr[] = {5, 4, 3, 2, 1}
 *
 * Output:
 * 1
 * Explanation:
 * The given array after modification
 * will be as such: 4 5 2 3 1.
 *
 * Example 2:
 *
 * Input:
 * n = 4
 * arr[] = {4, 3, 2, 1}
 *
 * Output:
 * 1
 */
public class PlayWithArray
{
    public static void main(String[] args)
    {
        int [] a = {5,4,3,2,1};
        int n = a.length;
        for (int i=0;i<n-1;i+=2)
        {
            if(a[i]>a[i+1])
            {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
