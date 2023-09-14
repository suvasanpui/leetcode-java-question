/*find the rotation count in rotated shorted array */
package leetcode;

public class CountRotation {
    public static void main(String [] args)
    {
        int[] arr={5,6,7,8,9,0,1,2,3,4};
        int result=search(arr);
        System.out.println(result);
    }
    static int search(int[] arr)
    {
        int pivot=count1(arr);
        
        return pivot+1;
    }
    static int count1(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(start<mid && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }else if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
