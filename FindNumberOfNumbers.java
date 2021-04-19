/**
 * Given an array A[]  of n elements.
 * Your task is to complete the Function num which returns an integer
 * denoting the total number of times digit k appears in the whole array.
 *
 * For Example:
 * Input:
 * A[]={11,12,13,14,15}, k=1
 * Output:
 * 6
 *
 * Explanation: Here digit 1 appears
 * the whole array 6 times.
 */
public class FindNumberOfNumbers
{
    public static void main(String[] args)
    {
        int a [] = {11,12,13,14,15};
        int n = a.length;
        int k = 1,x,rem,count=0;
        for(int i=0;i<n;i++)
        {
            x = a[i];
            while(x!=0)
            {
                rem = x%10;
                if(rem == k)
                   count++;
                x = x/10;
            }
        }
        System.out.println(count);
    }
}
