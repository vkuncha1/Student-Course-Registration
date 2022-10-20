package studentRecordsBackupTree.bst;

//Binary class tree to store values in accordance with BST rule
public class BST {
    Node root;

    //constructor
    public BST(){

        root = null;
    }

    //Insert method of BST

    public void insert(int BnumberIn){

        root = insertValue(root,BnumberIn);
    }

    public Node insertValue(Node root,int BnumberIn){
        if (root == null){
            root = new Node();
            return root;
        }
        else if (BnumberIn < root.Bnumber ){
            root.left = insertValue(root.left, BnumberIn);
            return root;
        }
        else{
            root.right = insertValue(root.right, BnumberIn);
            return root;
        }
    }

    //In Order Traversal
    public void display_bst() {
        display(root);
    }
    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print("BST :"+root.Bnumber + ",");
            display(root.right);
        }
    }
}
