package LinkedLists;


public class Main {
    public static void main(String[] args) {
        SingleLinkedListTest sll = new SingleLinkedListTest();
        sll.insertLinkedList(1,0);
        sll.insertLinkedList(2,1);
        sll.insertLinkedList(3,2);
        sll.insertLinkedList(4,3);
        sll.traverseLinkedList();
        sll.searchNode(5);

        // Delete method testing below
        System.out.println("Starting list:");
        sll.traverseLinkedList();

        // Deleting at an invalid position
        sll.delete(20);

        // Deleting head
        sll.delete(0);
        sll.traverseLinkedList();

        // Deleting from the middle of the list
        sll.delete(1);
        sll.traverseLinkedList();

        // Deleting from the tail of the list
        sll.delete(sll.size - 1);
        sll.traverseLinkedList();

    }
}
