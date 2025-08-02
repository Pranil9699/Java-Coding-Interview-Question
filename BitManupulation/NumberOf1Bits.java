import java.util.*;

public class NumberOf1Bits {
    public static void main(String[] args) {
      int n=10,count=0;
      int temp=n;
      while(n!=0){
        n=n&(n-1);
        count++;
      }
        
      System.out.println("Hamming Weight in "+temp+" is "+count);
  }
}
