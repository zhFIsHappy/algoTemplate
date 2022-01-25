public class BSTIterator {
    List<TreeNode>inorder Traversal(TreeNode node){
        List<TreeNode> inorder = new ArrayList<>();
        if(root== null){
            return inorder
        }
        //create a dummy node, right pointer point to the node;
        // put it into the stack, the position of iterator is @ the top of the stack;
        TreeNode dummy = new TreeNode(0);
        dummy.right = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(dummy);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.right != null){
                node = node.right;
                while(node!=null){
                    stack.push(node);
                    node= node.left;
                }
            }
            if(!stack.isEmpty()){
                inorder.add(stack.peek());
            }
        }
    }
    
}
// Time complexity O(n)
// Space complexity O(n)