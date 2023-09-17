/*You are given an array Arr of size N. You need to find all pairs in the array that sum to a number K. If no such pair exists then output will be -1. The elements of the array are distinct and are in sorted order.*/
/*Input:
n = 7
arr[] = {1, 2, 3, 4, 5, 6, 7}
K = 8
Output:
3
Explanation:
We find 3 such pairs that
sum to 8 (1,7) (2,6) (3,5 */
package leetcode;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        int size=7;
        int sum=100;
        System.out.println(countpair(arr,size,sum));
    }
    static int countpair(int[] arr,int n,int sum)
    {
        int res=countpair1(arr, n, sum);
        if(res!=0)
        {
            return res;
        }
        return -1;
    }
    static int countpair1(int a[], int n, int sum)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int k=i+1;k<n;k++)
            {
                if(a[i]+a[k]==sum)
                {
                    count=count+1;
                }
                
            }
            
        }
        return count;
        
    }
}
