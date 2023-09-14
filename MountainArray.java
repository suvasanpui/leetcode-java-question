package leetcode;

/*peak index in a mountain array oin leetcode */
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {
    public static void main(String [] args)
    {
        int[] nums={1,2,5,7,8,5,3,2};
        System.out.println(peakindexmountainarray(nums));
    }   
    static int peakindexmountainarray(int[] arr)
    {
        int start,mid,end;
        start=0;
        end=arr.length;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])//increashing order
            {
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    } 
}
