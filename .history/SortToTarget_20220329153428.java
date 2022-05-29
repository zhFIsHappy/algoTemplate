public class SortToTarget {
    public int partitionArray(int[] nums, int k){
        int lastSmallPointer = -1;
        for(int i =0; i<nums.length; i++){
            if(nums[i]<k){
                lastSmallerPointer++;
                swap(nums, lastsmallPointer, i);
            }
        }
        return lastSmallerPointer +1; 
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[[]]
    }
}
