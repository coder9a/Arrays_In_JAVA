/**
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 */

import java.util.HashMap;

class CountSubArraySumEqualsK
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3};
        int k=3;
        int n = a.length;
        int ans=0;
        int sum=0;
        int remSum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum += a[i];
            remSum = sum - k;
            if(map.containsKey(remSum))
            {
                ans += map.get(remSum);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
//            or
//            if(map.containsKey(sum))
//            {
//                map.put(sum,map.get(sum)+1);
//            }
//            else
//            {
//                map.put(sum,1);
//            }
        }
        System.out.println(ans);
    }
}
