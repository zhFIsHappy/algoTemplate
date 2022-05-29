public class SortToTarget {
    public int partitionArray(int[] nums, int k) {
        int lastSmallPointer = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                lastSmallPointer++;
                swap(nums, lastSmallPointer, i);
            }
        }
        return lastSmallPointer + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
