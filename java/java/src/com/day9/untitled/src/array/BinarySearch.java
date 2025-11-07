package array;

public class BinarySearch {
    public static void main(String[] args) {
        int target=42;
        int[] nums={11,24,35,42,56};
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                index=mid;
                break;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        long end_time=System.nanoTime();
        System.out.println("Target " + target + " is found at index " + index);

    }
}

