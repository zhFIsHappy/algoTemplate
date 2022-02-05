public class BFSDummyNode {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        Queue<TreeNOde> Q = new LinkedList<TreeNode>();
        Q.offer(root);
        Q.offer(null);
        List<Integer> level = new ArrayList<Integer>();
        while(!Q.isEmpty()){
            TreeNode node = Q.poll();
            if(node == null){
                if(level.size() == 0){
                    break;
                }
                result.add(level);
                level = new ArrayList<Integer>();
                Q.offer(null);
                continue;
            }
            level.add(node.val);
            if(node.l)
        }
    }
}
