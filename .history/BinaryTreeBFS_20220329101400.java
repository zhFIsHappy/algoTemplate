public class BinaryTreeBFS {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null){
            return new ArrayList<>();
        }
        List<List<Integer>> queue = new ArrayList<>();
        queue.add(new LinkedList<Integer>());// 这里因为之后没用get method 所有可以直接用linkedlist
        Arrays.sort(nums);
        for (int num : nums) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(queue.get(i));
                subset.add(num);
                queue.add(subset);
            }
        }
        return queue;
    }
}
