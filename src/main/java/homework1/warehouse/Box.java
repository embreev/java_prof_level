package homework1.warehouse;

import java.util.ArrayList;
import java.util.Arrays;

class Box<T extends Fruit> {
    private ArrayList<T> boxAL;

    public Box(T... arr) {
        boxAL = new ArrayList<T>(Arrays.asList(arr));
    }

    public float getWeight() {
        if (boxAL.size() == 0) return 0.0f;
        return boxAL.get(0).getWeight() * boxAL.size();
    }

    public void addFruit(T fruit) {
        boxAL.add(fruit);
    }

    public boolean compare(Box box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001f;
    }

    public void pourFruit(Box<? super T> box) {
        box.boxAL.addAll(this.boxAL);
        this.boxAL.clear();
    }
}