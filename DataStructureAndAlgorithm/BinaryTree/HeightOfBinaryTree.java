/*
You are given a binary tree. You need to print the maximum height of the binary tree.
If the tree is NULL (empty tree), print the height of the tree as 0.

            1
       2         3
   4      5

Output: 3
Here, in the given tree, the maximum height of the binary tree is 3.

Input:
The input will be in the following format:

    The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
    The second line contains space-separated ‘n’ values. The code for inserting the values in the tree has been addressed in the code.

Output:
The output should be the height of the tree keeping in mind that the root node is at level 1.

Sample Input:
5
1 2 3 4 5

Sample Output:
3

Sample Input:
0

Sample Output:
0
 */

package DataStructureAndAlgorithm.BinaryTree;
import java.util.*;

class Nodes {
    int data;
    Nodes left, right;

    Nodes(int value) {
        data = value;
        left = right = null;
    }
}

    class Trees {
        Nodes root;

        Trees() {
            root = null;
        }

        // Method to construct a binary Trees from the given array
        public Nodes insertNode(int[] elementsArr, Nodes node, int i) {
            if(i < elementsArr.length){
                node = new Nodes(elementsArr[i]);
                node.left = insertNode(elementsArr,node.left,2 * i + 1);
                node.right = insertNode(elementsArr,node.right,2 * i + 2);
            }
            return node;
        }

        // Method to find the height of a binary Trees
        public int findHeight(Nodes node) {
            // Write your code here
            if (root == null) {
                return 0;
            } else {
                int leftHeight = 0, rightHeight = 0;

                //Calculate the height of left subtree
                if(node.left != null)
                    leftHeight = findHeight(node.left);

                //Calculate the height of right subtree
                if(node.right != null)
                    rightHeight = findHeight(node.right);

                //Compare height of left subtree and right subtree
                //and store maximum of two in variable max
                int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;

                //Calculate the total height of tree by adding height of root
                return (max + 1);
            }
        }
    }

    // WARNING: Do not edit the code given below; otherwise the test cases might fail
    public class HeightOfBinaryTree {
        public static void main(String[] x) {
            Trees tree = new Trees();

            int size;
            Scanner sc = new Scanner(System.in);
            size = sc.nextInt();
            if (size < 0){
                System.out.println("Size should be a positive integer");
            }

            else{
                int[] elementsArr = new int[size];
                for(int i = 0; i < size; i++) {
                    elementsArr[i] = sc.nextInt();
                }

                tree.root = tree.insertNode(elementsArr, tree.root, 0);

                System.out.println(tree.findHeight(tree.root));
            }
        }
    }
