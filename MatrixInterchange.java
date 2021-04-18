/**
 * Working with 2D arrays is quite important.
 * Here we will do swapping of columns in a 2D array.
 * You are given a matrix arr[][] of r rows and c columns.
 * You need to swap the first column with the last column.
 *
 * Example:
 *
 * Input:
 * r = 3
 * c = 4
 * arr[][] = {{1, 2, 3, 4},
 *            {4, 3, 2, 1},
 *            {6, 7, 8, 9}}
 * Output:
 * 4 2 3 1
 * 1 3 2 4
 * 9 7 8 6
 */
public class MatrixInterchange
{
    public static void main(String[] args)
    {
        int arr[][] = {{1, 2, 3, 4},{4, 3, 2, 1},{6, 7, 8, 9}};
        int i,j,r=3,c=4;
//        Interchange Elements
        for(i=0;i<r;i++)
        {
            int temp = arr[i][0];
            arr[i][0] = arr[i][c-1];
            arr[i][c-1] = temp;
        }

//         Printing elements
        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
