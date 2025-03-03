public class palindromeusingrecursion {

    public static boolean checkpalindrome(String x,int start,int end)
    {   
        if(start>=end)
        {
            return true;
        }
        
        if(x.charAt(start) != x.charAt(end))
        {
            return false;
        }

        return checkpalindrome(x, start+1, end-1);
    }

    public static void main(String[] args) {
        String x = "ABCDCBC";
        int start = 0;
        int end = x.length()-1;
        
        System.out.println(checkpalindrome(x,start,end));
    }
}
