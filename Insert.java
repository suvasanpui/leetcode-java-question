/*search insert position */
//https://leetcode.com/problems/search-insert-position/submissions/
package leetcode;

public class Insert {
    public static void main(String[] args)
    {
        int[] nums={1,3,5,6};
        int target=1;
        int result=searchInsert(nums,target);
        System.out.println(result);
    }
    static int searchInsert(int[] nums,int target)
    {
        int len=nums.length-1;
        int start=0;
        while(nums[start]<target)
        {
            for(int i=0;i<=len;i++)
            {
                for(int j=i+1;j<=len;j++)
                {
                    if(nums[i]<=target && nums[j]>=target)
                    {
                        return j;
                    }
                }
            }
            return (nums.length);
        }
        return 0;
    }
}