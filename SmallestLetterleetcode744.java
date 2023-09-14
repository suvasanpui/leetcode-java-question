/*find smallest letter which is greater than the target element 
same as ceilia{'c','f','j'} */
package leetcode;


public class SmallestLetterleetcode744
{
    public static void main(String [] args)
    {
        char[] letters={'c','f','j'};

        public char nextGreatestLetter(char[] letters,char target)
        {
            int start=0;
            int end=letters.length-1;
            while(start<=end)
            {
                mid=start+(end-start/2);
                if(letters[mid]<target)
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return letters[start%letters.length];

            
        }


    }
}
