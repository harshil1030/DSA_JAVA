public class recursiontwo {

    public static void reverselist(int start,int end)
    {
        if(start < end)
        {
            return;
        }
        System.out.println(start);
        reverselist(start-1,end);
    }

    public static void main(String[] args) {
        reverselist(10,1);
    }
}
