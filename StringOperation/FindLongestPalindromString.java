import java.util.Set;
import java.util.LinkedList;
import java.util.*;

public class FindLongestPalindromString{
    public static String longestPalindriom(String str){
        int start=0,end=0;
        
        for(int i = 0; i<str.length();i++){
            int len1 = expandFromCenter(str,i,i);
            int len2 = expandFromCenter(str,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start){
                start = i - (len -1)/2;
                end = i+len/2;
            }
        }
        return str.substring(start,end+1);
    }
    public static int expandFromCenter(String str,int left, int right){
        while(left>=0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--; 
            right++;
        }
        return right-left-1;
    }
    public static void main(String a[]){
        String str="opps ilovevoliprani to muchh";
        String str1="abcd";
        String result=longestPalindriom(str);
        System.out.println(result);
        result=longestPalindriom(str1);
        System.out.println(result);
        
        
        
    }
}
