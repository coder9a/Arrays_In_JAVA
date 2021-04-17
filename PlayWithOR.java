public class PlayWithOR
{
    public static void main(String[] args)
    {
        int [] a = {10, 11, 1, 2, 3};
        int n = a.length;
        for (int i=0;i<n-1;i++)
        {
            a[i] = a[i]|a[i+1];
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
