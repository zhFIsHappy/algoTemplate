public List<List<Integer>> subsets(int[] nums) {
    if (nums == null) return new ArrayList<>();
    List<List<Integer>> queue = new ArrayList<>();
    int index = 0;
    Arrays.sort(nums);
    queue.add(new ArrayList<>());
    while(index < queue.size()){
        List<Integer> subset = queue.get(index++);
        for(int i =0; i<nums.length; i++){
            if(subset.size() ==0 && subset.get(subset.size()-1)>= nums[i]){
                continue;
            }
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(nums[i]);
            queue.add(newSubset);

        }
    }

}

