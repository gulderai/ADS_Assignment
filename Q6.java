class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Q6 {

    public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {


            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }


            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }


            else {
                return root;
            }
        }

        return null;
    }

    public static void main(String[] args) {


        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        TreeNode p = root.left;   // 2
        TreeNode q = root.right;  // 8

        TreeNode lca = findLCA(root, p, q);

        System.out.println("LCA: " + lca.val);
    }
}
