public class Practice {
    int left =0;
    int right = nums.length -1;
    while(left +1 <right){
        int mid = left + (right-left)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            end = mid;
        }else{
            start = mid;
        }
    }
}
