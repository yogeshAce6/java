package array;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements for an array");
        int[] nums=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        //Printing all array elements
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");50
        }
        System.out.println();
        for(int temp:nums){
            System.out.print(temp+" ");
        }
    }
}


