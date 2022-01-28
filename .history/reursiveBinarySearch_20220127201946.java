//version-2: recursion
//这里可以mid+1 也可以不写+1。prefer b xie
public class Solution {
    /**
     * @param nums:   An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int findPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        if (start + 1 >= end) {
            if (nums[start] == target) {
                return start;
            }

            if (nums[end] == target) {
                return end;
            }

            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] < target) {
            return binarySearch(nums, mid, end, target);
        }

        if (nums[mid] >= target) {
            return binarySearch(nums, start, mid, target);
        }

        return -1;
    }
}
