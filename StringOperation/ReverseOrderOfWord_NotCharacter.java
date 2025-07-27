import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseOrderOfWord_NotCharacter{

public static void main(String []a){

String input="Pranil subhash Takawane";
LinkedList<String> list = new LinkedList<>(Arrays.asList(input.split(" ")));
//list.forEach(System.out::println);
Collections.reverse(list);
String resultString="";
while(!list.isEmpty())
resultString+=list.poll()+" ";

System.out.println(resultString);
}

}
