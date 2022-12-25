// Check wheather the String is Palindrome or not.
// How to check the string is Palindrome or not > i.e;
// If :  Before Palindrome : madam
//       After Palindrome  : madam
// i.e  121,dad,mom those are palindrome strings .
// so write a program which shows you ; if string is palindrome then return true ;
// else return False ;
//import java.io.StringReader;
//import java.util.*;

public class palindrome {
    public static boolean palindrom(String str){
        char[] charArray=str.toCharArray();
        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "";
        str = str.toLowerCase();
        boolean A = palindrom(str);

        if(A){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        } 
    }
}
