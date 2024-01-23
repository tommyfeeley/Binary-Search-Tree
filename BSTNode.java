/**
   Programmed by    Thomas Feeley
   Date Modified    4/2/2020 - added comments in JavaDoc format
*/

public class BSTNode<E>
{
    private E data;
    private BSTNode<E> left;
    private BSTNode<E> right;
    /*
     * constructor:
     * @param data, the data value for the node
     * @param left, the left subtree
     * @param right, the right subtree
     */
    BSTNode(E initialData, BSTNode<E> initialLeft, BSTNode<E> initialRight) {
        data = initialData;
        left = initialLeft;
        right = initialRight;
    }
    
    /*
     * Accessor method for data
     */
    
    public E getData() {
        return data;
    }
    
    /*
     * Accessor method for left
     */
    public BSTNode<E> getLeft() {
        return left;
    }
    
    /*
     * Accessor method for right
     */
    public BSTNode<E> getRight() {
        return right;
    }
    
    /*
     * Acessor method for RightmostData
     */
    public E getRightmostData() {
        if (right == null)
            return data;
        else
            return right.getRightmostData();
    }
    
    /*
     * Prints search tree in order
     */
    public void inorderPrint() {
        if (left != null)
            left.inorderPrint();
            
        System.out.println(data);
        
        if (right != null)
            right.inorderPrint();
    }
    
    /*
     * Removes the rightmost node if there is a right child
     */
    public BSTNode<E> removeRightmost() {
        if (right == null) {
            // The rightmost node is at the root because there is no right child.
            return left;
        }
        else {
            // A recursive call removes the rightmost node from my own right child.
            right = right.removeRightmost();
            return this;
        }
    }
    
    /*
     * Mutator method for data
     */
    public void setData(E newData) {
        data = newData;
    }
    
    /*
     * Mutator method for left
     */
    public void setLeft(BSTNode<E> newLeft) {
        left = newLeft;
    }
    
    /*
     * Mutator method for right
     */
    public void setRight(BSTNode<E> newRight) {
        right = newRight;
    }
}
    
