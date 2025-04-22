/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levels = new ArrayList<>();
        dfs(root, 0, levels);
        return levels;
    }

    public void dfs(Node curr, int level, List<List<Integer>> levels){
        if(curr == null)
            return;
        if(levels.size() <= level)
            levels.add(new ArrayList<>());
        levels.get(level).add(curr.val);
        for(Node c: curr.children)
            dfs(c, level+1, levels);
    }
}