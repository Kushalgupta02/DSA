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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> nodes = new ArrayList<>();

        // Store the nodes in sorted order
        storeInorder(root, nodes);

        // Build the balanced tree from the sorted nodes
        return buildbalance(nodes, 0, nodes.size()-1);
   
        
    }
    static void storeInorder(TreeNode root, ArrayList<Integer> nodes ){
        if(root==null){
            return;
        }
        storeInorder(root.left, nodes);
        nodes.add(root.val);
        storeInorder(root.right, nodes);
    }
    static TreeNode buildbalance(ArrayList<Integer> nodes, int start, int end){
        if(start>end)
            return null;

        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nodes.get(mid));

        root.left = buildbalance(nodes, start, mid - 1);
        root.right = buildbalance(nodes, mid + 1, end);

        return root;
    }
}