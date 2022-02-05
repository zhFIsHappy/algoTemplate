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
            
        }
    }
}
