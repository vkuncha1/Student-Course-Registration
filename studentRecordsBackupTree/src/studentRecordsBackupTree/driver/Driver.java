package studentRecordsBackupTree.driver;
import studentRecordsBackupTree.bst.BST;
import studentRecordsBackupTree.bst.BSTBuilder;
import studentRecordsBackupTree.util.Results;
/**
 * @author Venkata Achyuth, Kunchapu
 *
 */
public class Driver {


	public static void main(String[] args) {

		if ((args.length == 5) && args[0].equals("bstInput.txt") && args[1].equals("bstOutput.txt") && args[2].equals("errorLog.txt")) {

			/**
			 *  BSTBuilder to build the three trees.
			 */
			BST bst = new BST();
			bst.setIncr_value(Integer.parseInt(args[4]));
			BSTBuilder bstbuilder = new BSTBuilder(bst);
			bstbuilder.bstInput();

			/**
			 * Inorder traversal to print the values from the three trees in .txt file
			 */
			Results result = new Results();
			result.FileOutputDisplay(bstbuilder.getBst_result(), "BST");
			result.FileOutputDisplay(bstbuilder.getBackup_1_result(), "backup_1");
			result.FileOutputDisplay(bstbuilder.getBackup_2_result(), "backup_2");

			/**
			 * print the sum of all the B-Numbers in each of the three trees in .txt file
			 */
			result.FileOutputSum(bstbuilder.getBst_result(), "BST");
			result.FileOutputSum(bstbuilder.getBackup_1_result(), "backup_1");
			result.FileOutputSum(bstbuilder.getBackup_2_result(), "backup_2");

			/**
			 * Inorder traversal to print the values from the three trees in terminal
			 */
			result.TerminalOutput(bstbuilder.getBst_result(), "BST");
			result.TerminalOutput(bstbuilder.getBackup_1_result(), "backup_1");
			result.TerminalOutput(bstbuilder.getBackup_2_result(), "backup_2");
			/**
			 * print the sum of all the B-Numbers in each of the three trees in terminal
			 */
			result.TerminalOutputSum(bstbuilder.getBst_result(), "BST");
			result.TerminalOutputSum(bstbuilder.getBackup_1_result(), "backup_1");
			result.TerminalOutputSum(bstbuilder.getBackup_2_result(), "backup_2");
			/**
			 * print the sum of all the B-Numbers in each of the three trees in file after increment
			 */
			result.FileOutputInrSum(bstbuilder.getIncrBst_result(), "BST");
			result.FileOutputInrSum(bstbuilder.getBst_bkup1_incr_result(), "backup_1");
			result.FileOutputInrSum(bstbuilder.getBst_bkup2_incr_result(), "backup_2");
			/**
			 * print the sum of all the B-Numbers in each of the three trees in terminal after increment
			 */
			result.TerminalIncrOutputSum(bstbuilder.getIncrBst_result(), "BST");
			result.TerminalIncrOutputSum(bstbuilder.getBst_bkup1_incr_result(), "backup_1");
			result.TerminalIncrOutputSum(bstbuilder.getBst_bkup2_incr_result(), "backup_2");
		} else {
			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}
	}
}
