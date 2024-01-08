class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        Inorder(root,low,high);
        return sum;
    }
    public void Inorder(TreeNode root, int low, int high){
        if(root==null)return;
        Inorder(root.left,low,high);
        if(root.val>=low && root.val<=high)sum+=root.val;
        Inorder(root.right,low,high);
    }
}
