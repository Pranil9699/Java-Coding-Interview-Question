//put all zero element last in array and mentain non zero element sequence in its own order
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	
	    int array[]={1,2,0,3,0,1};
	    Arrays.stream(array).forEach(element -> System.out.println(element));
	    for (int i=0;i<array.length-1;i++){
	        int element=array[i];
	        if(element==0){
	           for(int j = i+1;j<array.length-1;j++){
	                int temp = array[j-1];
	                array[j-1]=array[j];
	                array[j]=temp;
	           }
	        }
	    }
	    Arrays.stream(array).forEach(element -> System.out.println(element));
	}
}
