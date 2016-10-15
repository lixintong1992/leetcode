/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private ListNode list; 
    private TreeNode sortedListToBST_2(int start, int end) { 
       if (start > end) return null; 
       int mid = (start + end) / 2; 
       TreeNode leftChild = sortedListToBST_2(start, mid-1); 
       TreeNode parent = new TreeNode(list.val); 
       parent.left = leftChild; 
       list = list.next; 
       parent.right = sortedListToBST_2(mid+1, end); 
       return parent; 
    } 
    public TreeNode sortedListToBST(ListNode head) { 
       int n = 0; 
       ListNode p = head; 
       while (p != null) { 
          p = p.next; 
          n++; 
       } 
       list = head; 
       return sortedListToBST_2(0, n - 1); 
    } 
}