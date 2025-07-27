// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class WordFrequencyAppender {
    public static void main(String[] args) {
        String inputString="i love You Pranil,You Can do it and i need only focus to my Stringths and notings, it improve my coding experiences i my";
        LinkedHashMap<String, Integer> listOfWord = new LinkedHashMap<>();
        String inputArray[]=inputString.split(" ");
        for(String str:inputArray){
            if(listOfWord.containsKey(str)){
                listOfWord.put(str,listOfWord.get(str)+1);
            }else
            listOfWord.put(str,1);
        }
        // Iterator<Map.Entry<String,Integer>> iterator = listOfWord.entrySet().iterator();
        String resultString="";
        // while(iterator.hasNext()){
        //     Map.Entry<String,Integer> map = iterator.next();
        //     System.out.println(map.getKey()+" : "+map.getValue());
            
        // }
        for(String str:inputArray){
            if(listOfWord.get(str)>1)
            resultString+=str+"("+listOfWord.get(str)+") ";
            else
            resultString+=str+" ";
        }
        System.out.println(resultString);
    }
}
