public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     public void printList(){
//        Node current = head;
//        while(current != null){
//            System.out.println(current.data);
//            current = current.next;
//        }
         printListRecursively(head);
    }

    public void add(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the end of the list
            }
            temp.next = newNode; // Insert the new node at the end
        }
    }

    private void printListRecursively(Node current){
        if(current==null){
            return;
        }
        System.out.println("The value is " + current.data);
        printListRecursively(current.next);
    }

}
