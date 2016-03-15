
/**
 *
 * @author kaminasan 
 * Simple BinaryTree class to be used with the NonRecursiveGoal Pathfinder class
 */
public class BinaryTree {
    BinaryTree leftChild = null;
    BinaryTree rightChild = null;
    boolean isGoalNode = false;
    String name;
    
    BinaryTree(String name, BinaryTree left, BinaryTree right, boolean isGoalNode) {
        this.name = name;
        leftChild = left;
        rightChild = right;
        this.isGoalNode = isGoalNode;
    }
}
