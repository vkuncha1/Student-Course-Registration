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
    int incrVal = 1;
    ArrayList<Integer> output_list_incr =new ArrayList<>();
    public ArrayList<Integer> increment_bst() {
        incr_tree(root);
        return output_list_incr;
    }
    public void incr_tree(Node root) {
        if (root != null) {
            incr_tree(root.getLeft());
            output_list_incr.add(root.getBnumber()+incrVal);
            incr_tree(root.getRight());
        }
    }

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

    ArrayList<Integer> output_list_incr_bk1 =new ArrayList<>();
    public ArrayList<Integer> increment_bst_bkp1() {
        incr_bk1_tree(root);
        return output_list_bkp1;
    }
    public void incr_bk1_tree(Node root) {
        if (root != null) {
            incr_bk1_tree(root.getLeft());
            output_list_incr_bk1.add(root.getBnumber()+incrVal);
            incr_bk1_tree(root.getRight());
        }
    }

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

    ArrayList<Integer> output_list_incr_bk2 =new ArrayList<>();
    public ArrayList<Integer> increment_bst_bkp2() {
        incr_bk2_tree(root);
        return output_list_bkp1;
    }
    public void incr_bk2_tree(Node root) {
        if (root != null) {
            incr_bk2_tree(root.getLeft());
            output_list_incr_bk2.add(root.getBnumber()+incrVal);
            incr_bk2_tree(root.getRight());
        }
    }
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
