class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {

            // Go to the leftmost node
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            // Process the node
            root = stack.pop();
            result.add(root.val);

            // Visit right subtree
            root = root.right;
        }

        return result;
    }
}