package trees;


public class PopulatingNextRightPointersinEachNodeTester {
    public static void main(String[] args) {
        PopulatingNextRightPointersinEachNode solution = new PopulatingNextRightPointersinEachNode();
        
        // Test Case 1: Perfect binary tree
        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  5 6  7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println("Test Case 1: Perfect Binary Tree");
        solution.connect(root);
        printNextPointers(root);
        
        System.out.println("\n---\n");
        
        // Test Case 2: Single node
        Node root2 = new Node(1);
        System.out.println("Test Case 2: Single Node");
        solution.connect(root2);
        printNextPointers(root2);
        
        System.out.println("\n---\n");
        
        // Test Case 3: Null tree
        System.out.println("Test Case 3: Null Tree");
        Node root3 = null;
        solution.connect(root3);
        System.out.println("Result: null");
    }
    
    private static void printNextPointers(Node root) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        
        Node current = root;
        while (current != null) {
            Node levelStart = current;
            StringBuilder sb = new StringBuilder();
            while (levelStart != null) {
                sb.append(levelStart.val);
                if (levelStart.next != null) {
                    sb.append(" -> ");
                } else {
                    sb.append(" -> null");
                }
                levelStart = levelStart.next;
            }
            System.out.println("Level: " + sb.toString());
            current = current.left;
        }
    }
}