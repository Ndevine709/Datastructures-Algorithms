package UndoRedo;

public class UndoRedo<T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private DoubleNode<T> current;

    public void addState(T value) {
        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.value = value;

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            if (current.next != null) {
                DoubleNode<T> tempNode = current.next;
                while (tempNode != null) {
                    DoubleNode<T> next = tempNode.next;
                    tempNode.previous = null;
                    tempNode.next = null;
                    tempNode = next;
                }
                current.next = null;
            }
            current.next = newNode;
            newNode.previous = current;
            current = newNode;
            tail = newNode;
        }
    }

    public T undo() {
        if (current != null && current.previous != null) {
            current = current.previous;
            return current.value;
        }
        return null;
    }

    public T redo() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.value;
        }
        return null;
    }

    public T getCurrentState() {
        return current != null ? current.value : null;
    }

    public T getLatestState() {
        return tail != null ? tail.value : null;
    }

}
