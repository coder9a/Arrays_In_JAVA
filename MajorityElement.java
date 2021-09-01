import java.util.HashMap;

/**
 * Given an array A of N elements.
 * Find the majority element in the array.
 * A majority element in an array A of size N is an element
 * that appears more than N/2 times in the array.
 *
 *
 * Example 1:
 * Input:
 * N = 3
 * A[] = {1,2,3}
 * Output:
 * -1
 * Explanation:
 * Since, each element in
 * {1,2,3} appears only once so there
 * is no majority element.
 *
 * Example 2:
 * Input:
 * N = 5
 * A[] = {3,1,3,3,2}
 * Output:
 * 3
 * Explanation:
 * Since, 3 is present more
 * than N/2 times, so it is
 * the majority element.
 */
public class MajorityElement
{
    public static void main(String[] args)
    {
//  -------------------------------------------------------------------
//        int[] arr = {2,2,2,2,5,5,2,3,3};
//        int i, j, n, count = 0, maxcount = 0, index = 0;
//        n = arr.length;
//        Time Complexity is O(n^2) ----->>> Brute Force Method
//        for (i = 0; i < n; i++)
//        {
//            count=0;
//            for (j = i; j < n; j++)
//            {
//                if (arr[i] == arr[j])
//                {
//                    count++;
//                }
//            }
//            if (count > maxcount)
//            {
//                maxcount = count;
//                index = i;
//            }
//        }
//        if (maxcount > n/2)
//        {
//            System.out.println(arr[index]);
//        }
//        else
//        {
//            System.out.println("NO Majority Element");
//        }
//  -------------------------------------------------------------------
//        Using HashMap, Time Complexity = O(n)
        int[] arr = {2,2,2,2,5,5,2,3,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        int c=0,x=-1,flag=0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
            if(map.get(arr[i]) > n/2)
            {
                x = arr[i];
                flag = 1;
            }
        }
        if(flag==1)
            System.out.println("Majority element : "+x);
        else
            System.out.println("No majority element");
    }
}
