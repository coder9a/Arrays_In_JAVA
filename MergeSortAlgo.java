
class MergeSortAlgo
{
    public static void merge(int a[], int p, int mid, int q)
    {
        int n1 = mid-p+1;
        int n2 = q-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i] = a[p+i];
        }
        for (int i=0;i<n2;i++)
        {
            right[i] = a[mid+1+i];
        }
        int  m=p;
        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                a[m] = left[i];
                m++;
                i++;
            }
            else
            {
                a[m] = right[j];
                m++;
                j++;
            }
        }
        while (i<n1)
        {
            a[m] = left[i];
            m++;
            i++;
        }
        while (j<n2)
        {
            a[m] = right[j];
            m++;
            j++;
        }

    }
    public static void mergeSort(int a[], int i, int j)
    {
        if(i<j)
        {
            int mid = (i+j)/2;
            mergeSort(a,i,mid);
            mergeSort(a,mid+1, j);
            merge(a, i, mid, j);
        }
    }
    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] a = {5,3,2,6,7,9,12,3,55,7,28};
        int n = a.length;
        printArray(a);
        mergeSort(a,0,n-1);
        System.out.println();
        printArray(a);
    }
}
