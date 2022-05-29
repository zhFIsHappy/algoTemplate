public class Practice {
    int start =0;
    int end = nums.length-1;
    int pivot = nums[(start+end)/2];
    while(start<=end){
        while(start<=end && nums[start]<nums[pivot]){
            start++;
        }
        while(start<=end &&nums[end]>nums[pivot]){
            end --;
        }
    }
}
