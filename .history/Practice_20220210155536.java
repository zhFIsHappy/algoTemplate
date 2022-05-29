public class Practice {
    List result = new ArrayList();
    if(root == null) return result;
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);
    while(queue.size()!=0){
        ArrayList<Integer> level = new ArrayList<Integer>();
        int size = queue.size();
        for(int u =0; i<size; i++){
            TreeNode head = queue.poll();
            level.add(head.value);
            if(head.left != null){
                level.add(level.left);
            }
            if(head.right != null){
                level.add(level.right);
            }
        }
        result.add(level);
    }
    return result
}
