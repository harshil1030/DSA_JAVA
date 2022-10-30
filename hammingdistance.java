public class hammingdistance {
    public static int hammingdista(String s1,String s2){
        int i=0;
        int count=0;

        while(i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
             i++;
            }           
        }
        return count;
      
    }

    public static int hamming(int[] arrA,int[] arrB){
        int i;
        int counta=0;

        for(i=0;i<arrA.length;i++){
            if(arrA[i]!=arrB[i]){
                counta++;
                i++;
            }     
        }
        return counta;
    }
    
    public static void main(String[] args) {
        String str1="hello";
        String str2="heelo";

        hammingdista(str1,str2);
        System.out.println(hammingdista(str1, str2));

        //int arrA[]={1,1,1,0,1,0,1};
        int arrB[]={1,1,0,0,1,1,1};     

       // hamming(arrA, arrB);
       // System.out.println(hamming(arrA, arrB));

    }
}
