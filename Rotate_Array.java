import java.util.Scanner;

public class Rotate_Array
{
    public static void main(String[] args)
    {
        int [] arr1 = {1,2,3,4,5};
        System.out.println("Enter rotating factor");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int l = arr1.length;
        int [] arr2 = new int[l];
        int i,j;
        for (i=d,j=0;i<l;j++,i++)
        {
            arr2[j] = arr1[i];
        }
        for (i=0;i<d;j++,i++)
        {
            arr2[j] = arr1[i];
        }
        for (i=0;i<l;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
