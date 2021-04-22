import java.util.*;

public class FindDuplicates
{
    public static void main(String[] args)
    {
        int a[] = {2,3,1,2,3,2};            //   ----->>>  {1,2,2,2,3,3}
        int n = a.length;
        Arrays.sort(a);
        int i=0;
        while(i<n-1)
        {
            if(a[i] == a[i+1])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else
            {
                i++;
            }
        }
    }
}
