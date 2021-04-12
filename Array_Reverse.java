/*
An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  (you may also see it written as ).
Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.
Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.
Input Format
The first line contains an integer,  (the number of integers in ).
The second line contains  space-separated integers describing .
Constraints
Output Format
Print all  integers in  in reverse order as a single line of space-separated integers.
Sample Input 1
CopyDownload
Array: arr
1
4
3
2

4
1 4 3 2
Sample Output 1
2 3 4 1
*/
import java.util.Scanner;

public class Array_Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = {12,23,34,45,56,65};
        int n = arr.length, x;
        for (int i=0;i<n/2;++i)
        {
            x = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = x;
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
