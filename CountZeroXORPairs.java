import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array A[] of size N. Find the number of pairs (i, j) such that
 * Ai XOR Aj = 0, and 1 ≤ i < j ≤ N.
 *
 * Example 1:
 *
 * Input : arr[ ] = {1, 3, 4, 1, 4}
 * Output : 2
 * Explanation:
 * Index( 0, 3 ) and (2 , 4 ) are only pairs
 * whose XORs is zero so count is 2.
 *
 * Example 2:
 *
 * Input : arr[ ] = {2, 2, 2}
 * Output :  3
 */
public class CountZeroXORPairs
{
    public static void main(String[] args)
    {
        int a[] = {1, 1, 2, 2, 3, 3, 4, 4};
        Arrays.sort(a);
        int n = a.length,count=0,sum=0;
        for (int i=0;i<n-1;i++)
        {
            if(a[i] == a[i+1])
            {
                count++;
            }
            else
            {
                sum += (count*(count+1))/2;
                count=0;
            }
        }
        sum += (count*(count+1))/2;
        System.out.println(sum);
    }
}

