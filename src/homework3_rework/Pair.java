package homework3_rework;

public class Pair<K,V> {
    private K first;
    private V Second;

    public Pair(K first, V second) {
        this.first = first;
        this.Second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return Second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", Second=" + Second +
                '}';
    }
}
