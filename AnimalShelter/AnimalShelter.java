public class AnimalShelter {
    private AnimalQueue dogs;
    private AnimalQueue cats;
    private int order = 0;

    public AnimalShelter(int capacity) {
        dogs = new AnimalQueue(capacity);
        cats = new AnimalQueue(capacity);
    }

    public void enqueue(Animal animal) {
        animal.setOrder(order++);
        if (animal instanceof Dog) {
            dogs.enqueue(animal);
        } else {
            cats.enqueue(animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return cats.dequeue();
        }

        if (cats.isEmpty()) {
            return dogs.dequeue();
        }

        Animal dog = dogs.peek();
        Animal cat = cats.peek();

        return dog.isOlderThan(cat) ? dogs.dequeue() : cats.dequeue();
    }

    public Animal dequeueDog() {
        return dogs.dequeue();
    }

    public Animal dequeueCat() {
        return cats.dequeue();
    }
}
