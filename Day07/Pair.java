public class Pair<T, V> {
    private T first;
    private V second;

    public T getFirst() {
        return this.first;
    }

    public V getSecond() {
        return this.second;
    }

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }
    
}
