package studentRecordsBackupTree.driver;
import studentRecordsBackupTree.bst.BST;
import studentRecordsBackupTree.bst.BSTBuilder;
import studentRecordsBackupTree.bst.Node;

/**
 * @author Venkata Achyuth, Kunchapu
 *
 */
public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		BST bst = new BST();
		BSTBuilder bstbuilder = new BSTBuilder(bst);
		bstbuilder.bstInput();
	}
}
