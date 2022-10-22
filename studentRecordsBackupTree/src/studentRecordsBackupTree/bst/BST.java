package studentRecordsBackupTree.bst;

import java.util.ArrayList;


/**
 * Binary class tree to store values in accordance with BST rule
 */

public class BST{
    private Node root;

    /**
     * Constructor of the BST class
     */
    public BST(){
        root = null;
    }

    /**
     * Insert method of BST
     * @param BnumberIn
     */

    public void insert(Node BnumberIn){
        root = insertValue(root,BnumberIn.getBnumber());
    }
    public Node insertValue(Node root,int BnumberIn){
        if (root == null){
            root = new Node(BnumberIn);
            return root;
        }
        else if (BnumberIn < root.getBnumber() ){
            root.setLeft(insertValue(root.getLeft(), BnumberIn));
            return root;
        }
        else{
            root.setRight(insertValue(root.getRight(), BnumberIn));
            return root;
        }
    }
    /**
     * Inorder Traversal display of the main BST
     */
    ArrayList<Integer> output_list =new ArrayList<>();
    public ArrayList<Integer> display_bst() {
        display(root);
        return output_list;
    }
    public void display(Node root) {
        if (root != null) {
            display(root.getLeft());
            output_list.add(root.getBnumber());
            display(root.getRight());
        }
    }
    /**
     * Inorder Traversal display of the backup_1 BST
     */
    ArrayList<Integer> output_list_bkp1 =new ArrayList<>();
    public ArrayList<Integer> display_bst_bkp1() {
        display1(root);
        return output_list_bkp1;
    }
    public void display1(Node root) {
        if (root != null) {
            display1(root.getLeft());
            output_list_bkp1.add(root.getBnumber());
            display1(root.getRight());
        }
    }

    /**
     * Inorder Traversal display of the backup_2 BST
     */
    ArrayList<Integer> output_list_bkp2 =new ArrayList<>();
    public ArrayList<Integer> display_bst_bkp2() {
        display2(root);
        return output_list_bkp2;
    }
    public void display2(Node root) {
        if (root != null) {
            display2(root.getLeft());
            output_list_bkp2.add(root.getBnumber());
            display2(root.getRight());
        }
    }
}
