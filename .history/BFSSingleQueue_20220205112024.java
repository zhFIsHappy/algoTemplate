public class BFSSingleQueue {
    List result = new ArrayList();
    if(root = null) return result;
    Queue <TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()) {
        ArrayList<Integer> level = new ArrayList<Integer>();
        int size = queue.size();
        for(int i =0; i< size; i++){
            TreeNode head = queue.poll();
            level.add(head.val);
            if(head.left!= null){
                queue.offer(head.left);
            }
            if(head.right!= null){
                queue.offer()
            }
        }
    }
}
