public class BinaryTreeDivide&Conquer
{

    public int divideConquer(TreeNode node){
        if(node==null) return;
        int leftSum = divideConquer(node.left);
        int rightSum = divideConquer(node.right);
        int result = merge  leftSum and rightSum;
        return result;
    }
}
