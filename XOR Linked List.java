// class Node {
//     int data;
//     Node npx;

//     Node(int x) {
//         data = x;
//         npx = null;
//     }
// }
class Solution {
    // function should insert the data to the front of the list
    static Node insert(Node head, int data) {
        // Code Here.
        Node newNode = new Node(data);
        newNode.npx = head;
        return newNode;
    }

    // function to print the linked list
    static ArrayList<Integer> getList(Node head) {
        // Code Here.
        ArrayList<Integer> al = new ArrayList<>();
        while (head!= null){
            al.add(head.data);
            head = head.npx;
        }
        return al;
    }
}
