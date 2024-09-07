package com.ArrayOperation;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums){
        int[] productArray = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j)
                product*=nums[j];
            }
            productArray[i]=product;
        }
        return productArray;
    }

    public static void main(String[] args) {
        
        int[] arr = {-1,1,0,-3,3};
        int[] result = productExceptSelf(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}