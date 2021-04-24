/**
 * Given a non-empty array of integers, find the top k elements which have the highest frequency in the array.
 * If two numbers have the same frequency then the larger number should be given preference.
 *
 * Example 1:
 *
 * Input:
 * nums = {1,1,1,2,2,3},
 * k = 2
 * Output: {1, 2}
 * Example 2:
 *
 * Input:
 * nums = {1,1,2,2,3,3,3,4},
 * k = 2
 * Output: {3, 2}
 * Explanation: Elements 1 and 2 have the
 * same frequency ie. 2. Therefore, in this
 * case, the answer includes the element 2
 * as 2 > 1.
 */

import java.util.*;

public class TopKFrequentElements
{
    public static void main(String[] args)
    {
        int a[] = {3, 1, 4, 4, 5, 2, 6, 1 };
        int n = a.length;
        int k=2;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
//        Create list from HashMap
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        System.out.println(list);
//        Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                if(o1.getValue() == o2.getValue())
                    return o2.getKey()-o1.getKey();
                else
                    return o2.getValue()-o1.getValue();
            }
        });
//        Print top k elements
        System.out.println(list);
        for (int i=0;i<k;i++)
        {
            System.out.println(list.get(i).getKey());
        }
    }
}
