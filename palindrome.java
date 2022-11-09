// Check wheather the String is Palindrome or not.
// How to check the string is Palindrome or not > i.e;
// If :  Before Palindrome : madam
//       After Palindrome  : madam
// i.e  121,dad,mom those are palindrome strings .
// so write a program which shows you ; if string is palindrome then return true ;
// else return False ;
import java.io.StringReader;
import java.util.*;

public class palindrome {
    public boolean palindrom(String word){
        char[] charArray=word.toCharArray();
        int star=0;
        int end=word.length()-1;

        while(star<end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return 0;
    }





    public static void main(String[] args) {
        StringReader stringUtil =new StringReader(null);
        if(stringUtil.palindrom("madam")){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
