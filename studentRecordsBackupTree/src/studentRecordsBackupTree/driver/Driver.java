package studentRecordsBackupTree.driver;
import studentRecordsBackupTree.bst.BST;
import studentRecordsBackupTree.bst.BSTBuilder;
import studentRecordsBackupTree.util.Results;



/**
 * @author Venkata Achyuth, Kunchapu
 *
 */
public class Driver {
	public static void main(String[] args)  {
		BST bst = new BST();
		BSTBuilder bstbuilder = new BSTBuilder(bst);
		bstbuilder.bstInput();

		//inorder traversal to print the values from the three trees.
		Results result = new Results();
		result.FileOutputDisplay(bstbuilder.getBst_result(),"BST");
		result.FileOutputDisplay(bstbuilder.getBackup_1_result(),"backup_1");
		result.FileOutputDisplay(bstbuilder.getBackup_2_result(),"backup_2");
		//print sum
		result.FileOutputSum(bstbuilder.getBst_result(),"BST");
		result.FileOutputSum(bstbuilder.getBackup_1_result(),"backup_1");
		result.FileOutputSum(bstbuilder.getBackup_2_result(),"backup_2");

	}
}
