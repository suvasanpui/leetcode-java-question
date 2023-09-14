/*find target in mountain array */
//algorithm
//1.find peak element
//if peak element is greater than the target element then apply binary search where start=0 and end=peak
//if peak element is less than the target element then apply binary search where start=peak and end=arraylength-1
package leetcode;

public class MountainArray2 {
    public static void main(String[] args)
    {
        int target;
        int[] nums={1,2,3,4,6,3,2,1};
        target=3;
        System.out.println(search(nums, target));
    }
    static int search(int[] arr,int target)
    {
        int peak=findpeak(arr);
        int fristoccerence=binary(arr,target,0,peak);
        if(fristoccerence!=-1)
        {
            return fristoccerence;
        }
        return binary(arr,target,peak+1,arr.length-1);
    }
    static int findpeak(int[] arr) 
    {
        int start,mid,end;
        start=0;
        end=arr.length-1;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
    static int binary(int[] arr,int target,int start,int end)
    {
        boolean isAse=arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAse){
                if(arr[mid]>target)
                {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]<target)
                {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }        
}
