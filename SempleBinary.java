package leetcode;

public class SempleBinary {
    public static void main(String [] args)
    {
        int[] arr={-1,0,3,5,9,12};
        int target=13;
        int result=search(arr,target);
        System.out.println(result);
    }
    static int search(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
