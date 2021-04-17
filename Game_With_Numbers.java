/**
 *  You are given an array arr[], you have to re-construct an array arr[].
 * The values in arr[] are obtained by doing XOR of consecutive elements in the array.
 */
public class Game_With_Numbers
{
    public static void main(String[] args)
    {
        int [] arr = {5, 9, 7, 6};
        int len = arr.length, i;
        for (i=0;i<len-1;i++)
        {
            arr[i] = arr[i]^arr[i+1];
        }
        for (i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
