public class hammingdistance {


    public static int hammingdista(String s1,String s2){    // Method for String 
        int i=0,count=0;
        while(i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }   
            i++;        
        }
        return count;
    }

    public static int hamming(int[] arrA,int[] arrB){       //Method for Numeric Values.
        int i;
        int counta=0;

        for(i=0;i<arrA.length;i++){
            if(arrA[i]!=arrB[i]){
                counta++;
            }  
            i++;  
        }
        return counta;
    }
    
    public static void main(String[] args) {                            //Main Method.
        String str1="hello";
        String str2="heelo";

        hammingdista(str1,str2);                                         //Calling Method1 
        System.out.println("Hamming Distance :"+hammingdista(str1, str2));

        int arrA[]={1,1,0,1};
        int arrB[]={1,1,0,1};     

       hamming(arrA, arrB);                                             //Calling Method2
       System.out.println("Hamming Distance :"+hamming(arrA, arrB));
    }
}
