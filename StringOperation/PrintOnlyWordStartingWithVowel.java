import java.util.LinkedList;
import java.util.Arrays;
//import java.util.Collections;

public class PrintOnlyWordStartingWithVowel{

public static void main(String []a){

String input="i love you Pranil which is greate person of life afvan elephent own u";
LinkedList<String> list = new LinkedList<>(Arrays.asList(input.split(" ")));

while(!list.isEmpty()){

String str=list.poll();
char ch=str.charAt(0);

switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.print(str+",");
default:
continue;
}
}
}
}
