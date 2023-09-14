/*remove duplicate from shorted array */
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package leetcode;

public class Duplicate {
    public static void main(String[] args)
    {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int result=removeDuplicates(nums);
        System.out.println(result);
    }
    static int removeDuplicates(int[] nums)
    {
        int i=0;
        for(int k=0;k<=nums.length-1;k++)
        {
            if(nums[i]!=nums[k])
            {
                nums[++i]=nums[k];
            }
        }
        return ++i;
    }
}
