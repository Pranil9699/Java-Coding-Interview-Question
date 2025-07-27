import java.util.Set;
import java.util.LinkedList;
import java.util.*;

public class CheckStringIsPangram{
    public static void main(String a[]){
        String str="the quick brown fox jumps over a lazy dog";
       
        
        Set<Character> setOfCharacter = new HashSet<>();
        for(char ch:str.toLowerCase().toCharArray())
            if(ch>='a' && ch<='z')
            setOfCharacter.add(ch);
        if(setOfCharacter.size()!=26){
            System.out.println("String is Not Pangram");
        }else{
            System.out.println("String is Pangram");

        }
    }
}
