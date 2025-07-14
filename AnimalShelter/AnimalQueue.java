public class AnimalQueue {
    private Animal[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public AnimalQueue (int capacity) {
        this.capacity = capacity;
        this.queue = new Animal[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Animal animal) {
        if (size == capacity) {
            System.out.println("Queue is currently full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = animal;
        size++;
    }

    public Animal dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is currently empty");
            return null;
        }
        Animal animal = queue[front];
        front = (front + 1) % capacity;
        size--;
        return animal;
    }

    public Animal peek() {
        return isEmpty() ? null : queue[front];
    }
}
