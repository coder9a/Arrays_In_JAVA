/**
 * Given an array arr[] of size n, find the first repeating element.
 * The element should occurs more than once and the index of its first occurrence should be the smallest.
 *
 *
 * Example 1:
 *
 * Input:
 * n = 7
 * arr[] = {1, 5, 3, 4, 3, 5, 6}
 * Output: 2
 * Explanation:
 * 5 is appearing twice and
 * its first appearence is at index 2
 * which is less than 3 whose first
 * occuring index is 3.
 *
 * Example 2:
 *
 * Input:
 * n = 4
 * arr[] = {1, 2, 3, 4}
 * Output: -1
 * Explanation:
 * All elements appear only once so
 * answer is -1.
 */

import java.util.*;

public class FirstRepeating
{
    public static void main(String[] args)
    {
        int a[] = {1, 15, 3, 4, 3, 15, 3, 6};
        int n = a.length;
        int index=-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=n-1;i>=0;i--)
        {
            if(map.containsKey(a[i]))
            {
                index = i;
            }
            else
            {
                map.put(a[i],1);
            }
        }
        if (index != -1)
        {
            System.out.println(index+1);
            System.out.println(a[index]);
        }
        else
            System.out.println("-1");
    }
}
