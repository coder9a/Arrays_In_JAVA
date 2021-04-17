public class Sum_Left_Diagonal
{
    public static void main(String[] args)
    {
        int a[][] = {{1,2,3}, {4,5,6}, {7, 8,9}};
        int n = a.length;
        int i,j,s=0;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if(i==j)
                {
                    s = s+a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}
