package leetcode;

public class Palindromeleetcode {
    static int palin(int x)
    {
        int rem,pali,match;
        pali=0;
        match=x;
        while(x>0)
        {
            rem=x%10;
            pali=(pali*10)+rem;
            x=x/10;
        }
        if(pali==match)
        {
            return 1;
        }else{
            return -1;
        }
    }
    public static void main(String [] args)
    {
        int x=121;
        System.out.println("this is palindrome number "+palin(x));
        
    }
    
}
