public class Practice {
    if(nums == null || nums.length == 0) return null;
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
    if(nums[start] == target){
        return start;
    }
    if(nums[end]== target){
        return end;
    }
    return -1;
}
