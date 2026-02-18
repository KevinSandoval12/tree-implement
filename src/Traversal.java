public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(10, null, null);

    TreeNode<String> stringRoot = new TreeNode<String>("hello", null, null);
    stringRoot.left = new TreeNode<String>("how", null, null);
    stringRoot.left.left = new TreeNode<String>("are", null, null);
    stringRoot.left.right = new TreeNode<String>("you", null, null);

    stringRoot.right = new TreeNode<String>("I", null, null);
    stringRoot.right.left = new TreeNode<String>("am", null, null);
    stringRoot.right.right = new TreeNode<String>("so", null, null);
    stringRoot.right.right.right = new TreeNode<String>("good", null, null);


    // preorder(root);
    // postorder(root);
    inorder(stringRoot);
    printGreater(root, 1);
    System.out.println(countNodes(root));
  }

  public static int countNodes(TreeNode<?> node){

    if (node == null) return 0;
    return countNodes(node.left) + countNodes(node.right) + 1;
    // int leftCount = countNodes(node.left);
    // int rightCount = countNodes(node.right);
    // int overallCount = leftCount + rightCount + 1;
    // return overallCount;
  }

  public static void printGreater(TreeNode<Integer> node, int threshold) {
    if (node == null) return;

    if (node.value > threshold){
      System.out.println(node.value);
    }

    printGreater(node.left, threshold);
    printGreater(node.right, threshold);
  }

  // Print a tree rooted at the given node in pre-order 
  public static void preorder(TreeNode<?> node) {
    // if null, return
    if(node == null) {
      return;
    }
    // print value
    System.out.println(node.value);
    // traverse left
    preorder(node.left);
    // traverse right
    preorder(node.right);
  }

  public static void postorder(TreeNode<?> node){
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.println(node.value);
  }

  public static void inorder(TreeNode<?> node){
    if (node == null) return;

    inorder(node.left);
    System.out.println(node.value);
    inorder(node.right);
  }
}
