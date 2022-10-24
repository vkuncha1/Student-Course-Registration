# CS542: Assignment 2
## Name: Venkata Achyuth Kunchapu
No of Slack days used : 0
-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on project.
#### Note: build.xml is present in studentCoursesBackup/src folder.
#### Note: courseInfo.txt, coursePrefs.txt, errorLog.txt, regConflicts.txt, and regResults.txt to be placed in same directory level as src

Assumptions : Input files are well formatted, and no dupulicates, Input File always available and not empty

-----------------------------------------------------------------------
## How to clean ?

Command: ant -buildfile studentRecordsBackupTree/src/build.xml clean

Description: It cleans up all the .class files that were generated when code was compiled.

-----------------------------------------------------------------------
## How to compile ?

Command: ant -buildfile studentRecordsBackupTree/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## How to run ?

Command: ant -buildfile studentRecordsBackupTree/src/build.xml run -Darg0=bstInput.txt -Darg1=bstOutput.txt -Darg2=errorLog.txt -Darg3=1 -Darg4=3


Argument 3 refers to DebulLevel and Argument 4 refers to the UPDATE_VALUE

-----------------------------------------------------------------------
## Sample Input and Output

#### UPDATE_VALUE = 3

#### bstInput.txt

7
13
5
10
14

#### bstOutput.txt

// Inorder traversal
BST: 5, 7, 10, 13, 14
backup_1: 5, 7, 10, 13, 14
backup_2: 5, 7, 10, 13, 14


// Sum of all the B-Numbers in each tree
BST: 49
backup_1: 49
backup_2: 49


// Sum of all the B-Numbers after increment
BST: 64
backup_1: 64
backup_2: 64

#### Terminal Output

// Inorder traversal
BST: 5, 7, 10, 13, 14
backup_1: 5, 7, 10, 13, 14
backup_2: 5, 7, 10, 13, 14


// Sum of all the B-Numbers in each tree
BST: 49
backup_1: 49
backup_2: 49


// Sum of all the B-Numbers after increment
BST: 64
backup_1: 64
backup_2: 64



#### errorLog.txt



-----------------------------------------------------------------------


#### Choice of Data Structure 

ArrayList is used to read the input,store the nodes, and writing outputs.

A ArrayList's insertion, deletion, and search operations typically require O(1) constant time. In the worst situation, searching, insertion, and deletion in Java take O(n) time. 

ArrayList was my choice because to store the list of observers,taking input and for output operations beacause searching, updation operations takes place with O(1) time. With increase in size, the ArrayList space will increase.



-----------------------------------------------------------------------
## Description:

This program takes five input arguments, bstInput.txt will include the Bnumber to be added in the binary search tree, bstOutput.txt will include the in order traversal values and the sum of the Bnumbers in tree before and after increment.

Here Node is both observer and subject. So, Node class implements both observer and subject interfaces, BST class implemnts the binary search tree creation along with in order traversal display and insert. BSTBuilder will build the tree using the node and inputs we are passing one by one and then it will create a backup_1 and backup_2 trees which are backup's for main tree and save both of them as observers.

Once the observers are added the same data in main tree will be inserted in backup trees using the observer pattern. Simillarly when an update is made in node like increment in this assignment then the bstBuilder will increment the value of main tree node by UPDATE_VALUE and notify all the registered observers about the change and update backups then after.

Result class will implements the FileDisplayInterface and StdoutDisplayInterface. This will take care of writing the results in output file and also in terminal (using logger class). File processor will acts as an api to read the input from input file.

BSTBuilder is calling the file processor API to read the input and do further process as mentioned above, File logger class uses the method called writemessage to print the output in terminal. If there are any errors in the program corresponding error message will be logged i errorLog file.

Driver class will Read command line arguments, set the debugLevel in MyLogger class, use BSTBuilder to build the three trees.
Call inorder traversal to print the values from the three trees, Call methods to print the sum of all the B-Numbers in each of the three trees,
Call methods to print the sum of all the B-Numbers in each of the three trees in outfiles and terminal.

 

-----------------------------------------------------------------------
## References:

1. https://www.geeksforgeeks.org/binary-search-tree-data-structure/
2. https://www.geeksforgeeks.org/filewriter-class-in-java/

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: -- 09/29/2022


