/**
 * Given an array A of positive integers. Your task is to find the leaders in the array.
 * An element of array is leader if it is greater than or equal to all the elements to its right side.
 * The rightmost element is always a leader.
 */
public class Leaders_In_Array
{
    public static void main(String[] args)
    {
        int [] arr = {16,17,4,3,5,2};
        int len = arr.length;
        boolean flag = true;
        int [] arr1 = new int[len];
        int i,j,k=0;
//  -------------------------------------------------------------------
//        Time Complexity is O(n)
        int max = arr[len-1];
        System.out.print(max+" ");
        for (i=len-2;i>=0;i--)
        {
            if(max<arr[i])
            {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
//  -------------------------------------------------------------------
//        Time Complexity is O(n^2)
//        for (i=0;i<len;i++)
//        {
//            for (j = i + 1; j < len; j++) {
//                if (arr[i] < arr[j])
//                    break;
//            }
//            if (j == len) {
//                System.out.print(arr[i]+" ");
//            }
//        }
//  -------------------------------------------------------------------
    }
}
