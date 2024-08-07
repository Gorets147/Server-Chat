package homework2;

/**
    Реализуйте простой обобщённый класс, такой как пара или кортеж.
    Затем создайте обобщенный метод, который работает с этим классом.
    Например, вы можете создать метод, который принимает пару и возвращает
    их сумму или конкатенацию.
*/

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair [key=" + key + ", value=" + value + "]";
    }

    public void sum(){
        try {
            System.out.println((int)key + (int)value);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
