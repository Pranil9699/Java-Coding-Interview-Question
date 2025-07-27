import java.util.LinkedList;
import java.util.Arrays;
public class CapitalizeFirstLetter {
public static void main(String []a){
String input="Pranil subhash Takawane";
LinkedList<String> list = new LinkedList<>(Arrays.asList(input.split(" ")));
//list.forEach(System.out::println);
String resultString="";
for (String str:list){
resultString+=Character.toUpperCase(str.charAt(0))+""+str.substring(1,str.length()).toLowerCase()+" ";
}
System.out.println(resultString);
}
}
