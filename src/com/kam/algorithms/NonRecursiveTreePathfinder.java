
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author kaminasan
 */
public class NonRecursiveTreePathfinder {
    
    public static void main(String[] args) {
        BinaryTree tree = NonRecursiveTreePathfinder.makeTree();
        NonRecursiveTreePathfinder treeChecker = new NonRecursiveTreePathfinder();
        treeChecker.solve(tree);
        
    }
    static BinaryTree makeTree() {
    BinaryTree root, a, b, c, d, e, f;
    c = new BinaryTree("C", null, null, false);
    d = new BinaryTree("D", null, null, false);
    e = new BinaryTree("E", null, null, true);
    f = new BinaryTree("F", null, null, false);
    a = new BinaryTree("A", c, d, false);
    b = new BinaryTree("B", e, f, false);
    root = new BinaryTree("Root", a, b, false);
    return root;
    
    }
  public boolean solve(BinaryTree startNode){
       ArrayList<BinaryTree> visited = new ArrayList<>();
       Stack<BinaryTree> treeStack = new Stack<>();
       treeStack.push(startNode);
       BinaryTree currentNode = startNode;
       while(!treeStack.empty()){ //go through each node, adding it to the 
           currentNode = treeStack.peek();
           BinaryTree leftSide = currentNode.leftChild;
           BinaryTree rightSide = currentNode.rightChild;
           if(visited.contains(leftSide) && visited.contains(rightSide)){
               visited.add(treeStack.pop());
               continue;
           }
           if(isGoal(currentNode)){
               displayPath(treeStack);
               return true;
           }
          
           if(isLeaf(currentNode) && !isGoal(currentNode)){
              visited.add(treeStack.pop());
              continue;
          }
          
          else{
               if(!visited.contains(leftSide) && leftSide != null){
                   treeStack.push(leftSide);
                   continue;
               }
               if(!visited.contains(rightSide) && rightSide!= null){
                   treeStack.push(rightSide);
                   continue;
               }
              
          }
          
       }
       return false;
   }
     public boolean isGoal(BinaryTree testNode){
        return testNode.isGoalNode;
    }
    
    public boolean isLeaf(BinaryTree testNode){
        return (testNode.leftChild == null && testNode.rightChild == null);
    }
    public  void displayPath(Stack<BinaryTree> stack){
        while(!stack.empty()){
            BinaryTree myTree = stack.pop();
            System.out.println(myTree.name);
        }
    }
}

