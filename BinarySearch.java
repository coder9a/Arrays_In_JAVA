import java.util.Scanner;
class Binary
{
    static void BinarySearchArray(int a[],int i, int j, int x)
    {
        if(i==j)
        {
            if(x == a[i])
                System.out.println("Element at position "+(i+1));
            else
                System.out.println("Element not found");
        }
        else
        {
            int mid = (i+j)/2;
            if(a[mid] == x)
            {
                System.out.println("Element at position "+(mid+1));
            }
            else if(x>a[mid])
            {
                BinarySearchArray(a, mid+1, j, x);
            }
            else
            {
                BinarySearchArray(a,i,mid,x);
            }
        }
    }
}
public class BinarySearch
{
    public static void main(String[] args)
    {
        int [] a = {1, 2, 3, 4, 5,11,22,34,55,66,77,88,99,12,23,34,45};
        int n = a.length;
        System.out.println("Enter element to be searched");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i=0;
        Binary.BinarySearchArray(a,0,n-1,x);
    }
}
