package leetcode;

/*find position of an element in a shorted array of infinity number */
public class Findindex {
    public static void main(String [] args)
    {
        int[] nums={10,20,25,27,28,29,30,32,34,35,38,39,40,41,45,48,49,50,52,57};
        int target=35;
        System.out.println(changeindex(nums,target));
    }
    static int changeindex(int nums[],int target)
    {
        int frist,last;
        frist=0;
        last=1;
        while(target>nums[last])
        {
            int fristnew=last+1;
            last=last+((last-frist)+1)*2;
            frist=fristnew;
        }
       return binarysearch2(nums,target,frist,last);
    }
    static int binarysearch2(int[] nums,int target,int start,int end)
    {
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }else
            {
                return mid;
            }
        }
        return -1;
    }
}
