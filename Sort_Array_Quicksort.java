class Quicksort
{
    public static int partition(int a[],int low, int high)
    {
        int pivot, i, j;
        pivot = a[low];
        i = low;
        for(j=low+1;j<=high;j++)
        {
            if(a[j]<=pivot)
            {
                i=i+1;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[low];
        a[low] = a[i];
        a[i] = temp;
        return i;
    }
    public void quicksort(int a[],int i, int j)
    {
        int m;
        if(i<j)
        {
            m = partition(a,i,j);
            quicksort(a,i,m-1);
            quicksort(a,m+1,j);
        }
    }
    public void printArray(int a[])
    {
        int n = a.length;
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
public class Sort_Array_Quicksort
{
    public static void main(String[] args)
    {
        int a[] = {0, 2, 1, 2, 0};
        int n = a.length;
        Quicksort qs = new Quicksort();
        qs.quicksort(a,0,n-1);
        qs.printArray(a);
    }
}
