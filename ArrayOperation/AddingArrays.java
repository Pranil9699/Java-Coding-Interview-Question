package com.ArrayOperation;

import java.util.Arrays;
import java.util.stream.Stream;

public class AddingArrays {

	public static void main(String[] args) {
		String[] array1 = { "Pranil", "Sujit", "Snehal", "Kartik", "Arya", "Rohan", "Yash" };
		String[] array2 = { "Nandini", "Pritam", "Akansha" };
		Stream<String> stream1 = Arrays.stream(array1);
		Stream<String> stream2 = Arrays.stream(array2);

		String[] CombinedArray = Stream.concat(stream1, stream2).toArray(e -> new String[e]);
		for (String string : CombinedArray) {
			System.out.println(string);
		}
		main1();

	}
	public static void main1() {
        int array1[]={1,2,3,4,5};
        int array2[]={5,6,7,8,9,0};
        int addingArray[]=new int[array1.length+array2.length];
        int i;
        int j=0;
        for(i=0;i<addingArray.length;i++){
            if(i>=array1.length){
              addingArray[i]= array2[j++];
            }else{
              addingArray[i]= array1[i];
            }
        }
        for(int k=0;k<addingArray.length;k++){
            System.out.print(addingArray[k]+",");
        }
    }
}
