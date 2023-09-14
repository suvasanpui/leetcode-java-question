/*search in rotated shorted shorted array */
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
//frist find out pivot element 
package leetcode;

public class RotationalArray
{
    public static void main(String[] args)
    {
        int[] arr={5,6,7,8,9,10,0,1,2,3,4};
        int target=4;
        int result=search(arr,target);
        System.out.println(result);
    }
    static int search(int[] nums,int target)
    {
        int peak=findpivot(nums);
        if(peak==-1)
        { 
            return binary(nums,target,0,nums.length-1);
        }
        if(nums[peak]==target)
        {
            return peak;
        }
        if(nums[0]<=target)
        {
            return binary(nums,target,0,peak-1);
        }else{
            return binary(nums,target,peak+1,nums.length-1);
        }
    }
    static int findpivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }else if(start<mid && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }else if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binary(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }else if(arr[mid]<target)
            {
                start=mid+1;
            }else
            {
                return mid;
            }
        }
        return -1;
    }
}