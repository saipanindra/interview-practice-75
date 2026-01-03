
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CreateBinaryTreeFromDescriptions {
    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer, TreeNode> m = new HashMap();
        for (int i = 0; i < descriptions.length; i++) {
            populateMap(descriptions[i], m);
        }
        for (int i = 0; i < descriptions.length; i++) {
            TreeNode parent = m.get(descriptions[i][0]);
            TreeNode child = m.get(descriptions[i][1]);
            if (descriptions[i][2] == 1) {
                parent.left = child;
            }
            if (descriptions[i][2] == 0) {
                parent.right = child;
            }
        }

        Set<Integer> children = new TreeSet<>();
        for (int i = 0 ; i < descriptions.length; i++) {
            children.add(descriptions[i][1]);
        }

        for (Integer key: m.keySet()) {
            if (!children.contains(key)) {
                return m.get(key);
            }
        }
        return null;

    }

    private void populateMap(int[] description, Map<Integer, TreeNode> m) {
        m.putIfAbsent(description[1], new TreeNode(description[1]));
        m.putIfAbsent(description[0], new TreeNode(description[0]));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
