public abstract class Animal {
    private String name;
    private int order;

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public boolean isOlderThan(Animal animal) {
        return this.order < animal.getOrder();
    }
    
}