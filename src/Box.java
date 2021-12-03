import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<T> {

    private List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {
        return fruits;
    }


    public float getWeight() {
        float sum = 0.0F;

        for (Fruit fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void add(T fruit, int amount) {
        fruits.add(fruit);


    }

    public void merge(Box<T> other) {
        fruits.addAll(other.getFruits());
        other.getFruits().clear();
    }

    public boolean compare(Box<? extends Fruit> other) {
        return getWeight() == other.getWeight();
    }

    @Override
    public int compareTo(T other) {
        return Float.compare(getWeight(), other.getWeight());
    }
}

