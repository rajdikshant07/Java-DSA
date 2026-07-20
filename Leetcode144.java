//leetcode 144 - Binary Tree Preorder Traversal

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root != null) {
            stack.push(root);
        }

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();
            result.add(node.val);

            // Push right first
            if (node.right != null) {
                stack.push(node.right);
            }

            // Then push left
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;
    }
}