class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null)
            return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int childCount = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                int sameParentCount = 0;

                if (curr.left != null) {
                    if (curr.left.val == x || curr.left.val == y) {
                        childCount++;
                        sameParentCount++;
                    }
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    if (curr.right.val == x || curr.right.val == y) {
                        childCount++;
                        sameParentCount++;
                    }
                    queue.offer(curr.right);
                }
                if(sameParentCount==2){
                    return false;
                }

                

            }
            if(childCount==2){
                    return true;
                }

                if(childCount==1){
                    return false;
                }

        }

        return false;
    }
}