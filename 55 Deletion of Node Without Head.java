// Time Complexity :  0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    void deleteNode(Node node) {
        // Your code here
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
