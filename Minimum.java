/*find minimum in rotated shorted array */
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.
package leetcode;

public class Minimum {
    public static void main(String[] args)
    {
        int[] nums={3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums)
    {
        int pivot=search(nums);
        return nums[pivot+1];
    }
    static int search(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }else if(start<mid && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }else if(nums[mid]<=nums[start])
            {
                end=mid-1;
                
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
