/**
 * Equilibrium index of an array is an index such that
 * the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * Given an array, your task is to find the index of first Equilibrium point in the array.
 *
 * Input Format:
 * The first line of input takes an integer T denoting the no of test cases, then T test cases follow.
 * The first line of each test case is an integer N denoting The size of the array.
 * Then in the next line are N space-separated values of the array.
 *
 * Output Format:
 * For each test case, the output will be the equilibrium index of the array.
 * If no such index exists output will be -1.
 *
 * Example(To be used only for expected output):
 * Input
 * 2
 * 4
 * 1 2 0 3
 * 4
 * 1 1 1 1
 *
 * Output
 * 2
 * -1
 */
public class EquilibriumIndex
{
    public static void main(String[] args)
    {
        long a[] = {-7, 1, 5, 2, -4, 3, 0};
        int n = a.length;
        int leftSum=0, rightSum=0;
        for(int i=0;i<n;i++)
        {
            leftSum+= a[i];
        }
        for (int i=0;i<n;i++)
        {
            leftSum-=a[i];
            if(leftSum == rightSum)
                System.out.println(i);
            else
                rightSum+=a[i];
        }
    }
}
