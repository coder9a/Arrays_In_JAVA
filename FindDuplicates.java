/**
 * Given an array a[] of size N which contains elements from 0 to N-1,
 * you need to find all the elements occurring more than once in the given array.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * a[] = {0,3,1,2}
 * Output: -1
 * Explanation: N=4 and all elements from 0
 * to (N-1 = 3) are present in the given
 * array. Therefore output is -1.
 * Example 2:
 *
 * Input:
 * N = 5
 * a[] = {2,3,1,2,3}
 * Output: 2 3
 * Explanation: 2 and 3 occur more than once
 * in the given array.
 */

import java.util.*;

public class FindDuplicates
{
    public static void main(String[] args)
    {
//        ------------------------------------------------------------
//        Time Complexity = O(n) & Space Complexity = O(n)
//        int a[] = {2,3,1,2,3,2};
//        int n = a.length;
//        ArrayList<Integer> arl = new ArrayList<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0;i<n;i++)
//        {
//            if(map.containsKey(a[i]))
//            {
//                map.put(a[i], map.get(a[i])+1);
//            }
//            else
//            {
//                map.put(a[i],1);
//            }
//        }
//        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
//        Iterator<Map.Entry<Integer,Integer>> itr = set.iterator();
//        {
//            while (itr.hasNext())
//            {
//                Map.Entry<Integer, Integer> hmap = itr.next();
//                if(hmap.getValue()>1)
//                    arl.add(hmap.getKey());
//            }
//        }
//        Collections.sort(arl);
//        if(arl.isEmpty())
//        {
//            arl.add(-1);
//            System.out.println(arl);
//        }
//        else
//            System.out.println(arl);
//        -----------------------------------------------------------
//        Time Complexity = O(n) & Space Complexity = O(n)
//        int a[] = {2,3,1,2,3,2};
//        int n = a.length;
//        ArrayList<Integer> arl = new ArrayList<>();
//        for(int i : a)
//        {
//            int j = Math.abs(i);
//            if(a[j]>=0)
//                a[j] = a[j]*-1;
//            else
//            {
//                if(!arl.contains(j))
//                    arl.add(j);
//            }
//        }
//        System.out.println(arl);
//        -----------------------------------------------------------
//        Time Complexity = O(n) & Space Complexity = O(1)
        int a[] = {1,2,3,3,2,3};
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            a[a[i]%n] = a[a[i]%n] + n;
        }
        for (int i=0;i<n;i++)
        {
            if (a[i]/n > 1)
                System.out.print(i+" ");
        }
    }
}
