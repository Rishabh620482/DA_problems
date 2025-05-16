class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddLinkedLists {
    public static Node addLists(Node l1, Node l2){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry !=0) {
            int x = (l1!=null) ? l1.data : 0;
            int y = (l2!=null) ? l2.data : 0;
            int sum = x + y + carry;
            carry = sum/10;
            temp.next = new Node(sum%10);
            temp = temp.next;

            l1 = l1.next;
            l2 = l2.next;
        }
        return dummy.next;
    }
    public static Node createList(int[] arr){
        Node dummy = new Node(0);
        Node curr = dummy;
        for (int val : arr) {
            curr.next = new Node(val);
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3};
        int[] arr2 = {5, 6, 4};

        Node l1 = createList(arr1);
        Node l2 = createList(arr2);
        System.out.print("List 1: ");
        printList(l1);
        System.out.print("List 2: ");
        printList(l2);

        Node result = addLists(l1, l2);
        System.out.print("Sum : ");
        printList(result);
    }
    public static void printList(Node head) {
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}
