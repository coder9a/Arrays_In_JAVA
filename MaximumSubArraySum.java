public class MaximumSubArraySum
{
//    public static void main(String[] args)
//    {
//        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int i=0,j=0,n;
//  -------------------------------------------------------------------
//        Time Complexity is O(n^2) ----->>> Brute Force Method
//        int maxSum = Integer.MIN_VALUE;
//        n = arr.length;
//        int sum = 0;
//        for (i=0;i<n;i++)
//        {
//            sum=arr[i];
//            for (j=i+1;j<n;j++)
//            {
//                sum = sum+arr[j];
//                maxSum = Math.max(maxSum,sum);
//            }
//        }
//        System.out.println(maxSum);
//    }
//  ---------------------------------------------------------------------
//        Time Complexity O(nlogn)   ----->>> Divide & Conquer
    public static int CrossSum(int arr[], int low, int mid, int high)
    {
        int sum=0;
//        For Left Maximum
        int left_max = Integer.MIN_VALUE;
        for(int i=mid;i>=low;i--)
        {
            sum = sum+arr[i];
            if(sum>left_max)
                left_max = sum;
        }
        sum=0;
//        For Right Maximum
        int right_max = Integer.MIN_VALUE;
        for(int i=mid+1;i<=high;i++)
        {
            sum = sum+arr[i];
            if (sum>right_max)
                right_max = sum;
        }
        return Math.max(left_max+right_max,Math.max(left_max,right_max));
    }
    public static int MaximumSum(int arr[], int i, int j)
    {
//        Base Case : Only One element
        if(i==j)
            return arr[i];
        int m = (i+j)/2;
        return Math.max(Math.max(MaximumSum(arr, i,m),MaximumSum(arr,m+1,j)),CrossSum(arr,i,m,j));
    }
    public static void main(String[] args)
    {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        int sum = MaximumSum(arr, 0, n-1);
        System.out.println("Maximum Sum is : "+sum);
    }
}