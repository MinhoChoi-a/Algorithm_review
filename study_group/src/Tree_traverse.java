/*
given tree node, we have to traverse each node from the root to the bottom, and from the left to the right.
While traversing each node, we have to make arraylist which has element, and each element is representative of the level of the tree node.
so each element will have the list which has the element for the each level of tree node.

input tree node.

*Solution

-We can use recursive call, then we can make the new array whenever we reached to the deeper level.
But we have to check if we already made the array for that level.
After that, we can add value to that array, and we can check if that node has left or child node.
if it has left child, then it will traverse to the left first since we have to add each element from left to right.
 */


import java.util.ArrayList;
import java.util.List;

public class Tree_traverse {

    public List<List<Integer>> levelOrder(TreeNode root) {

        int level = 0;
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        if(root == null) {
            return list;
        }


        recursive(root, level, list);

        return list;

    }

    public void recursive(TreeNode root, int level, List<List<Integer>> list) {

        level++;
        if(list.size() < level) {
            list.add(new ArrayList<Integer>());
        }

        list.get(level-1).add(root.val);

        if(root.left != null) {

            recursive(root.left, level, list);

        }

        if(root.right != null) {

            recursive(root.right, level, list);

        }

    }

    public class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
