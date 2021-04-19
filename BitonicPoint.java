/**
 * Given an array Arr of N elements which is first increasing and then may be decreasing,
 * find the maximum element in the array.
 * Note: If the array is increasing then just print then last element will be the maximum value.
 *
 * Example 1:
 *
 * Input:
 * N = 9
 * Arr[] = {1,15,25,45,42,21,17,12,11}
 * Output: 45
 * Explanation: Maximum element is 45.
 * Example 2:
 *
 * Input:
 * N = 5
 * Arr[] = {1, 45, 47, 50, 5}
 * Output: 50
 * Explanation: Maximum element is 50.
 */
class BitonicPoint
{
    static int BinarySearch(int a[], int i, int j)
    {
        if(i<j)
        {
            int mid = (i+j)/2;
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
                return mid;
            if(a[mid]<a[mid+1])
                return BinarySearch(a,mid+1,j);
            else
                return BinarySearch(a,i,mid-1);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int a[] = {6, 7, 8, 11, 9, 5, 2, 1};
        int n = a.length;
        int result = BinarySearch(a,0,n-2);
        if(result!=-1)
        {
            System.out.println("Element is : "+a[result]+"\nAt index : "+(result+1));
        }
    }
}