package trees;


public class PopulatingNextRightPointersinEachNode {

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        return process(root, null);
    }

    private Node process(Node current, Node parent) {
        if (parent != null) {
            if (parent.right == current) {
                System.out.println("Current " + current.val + " is right child of parent " + parent.val);
                if (parent.next != null) {
                    System.out.println("Current node: " + current.val);
                    current.next = parent.next.left;
                }
            }
            else   if (parent.left == current) {
                System.out.println("Current " + current.val + " is left child of parent " + parent.val);

                    current.next = parent.right;
                }
            }

        if (current.left == null) {
            return current;
        }

        process(current.left, current);
        process(current.right, current);

        return current;
    }

}


