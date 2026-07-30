/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Integer> sorted = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root){
        inOrderTraversal(root);
        
        return buildBalancedBST(0, sorted.size() - 1);
    }

    private void inOrderTraversal(TreeNode node){
        if(node == null) {
            return;
        }
        inOrderTraversal(node.left);
        sorted.add(node.val);
        inOrderTraversal(node.right);
    }

    private TreeNode buildBalancedBST(int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(sorted.get(mid));

        root.left = buildBalancedBST(start, mid - 1);
        root.right = buildBalancedBST(mid + 1, end);

        return root;
    } 
}