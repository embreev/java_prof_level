package warehouse;

import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> boxAL;
    private int quantity;
    private T obj;

    public Box(int quantity) {
        this.quantity = quantity;
        this.boxAL.add(obj);
    }

//    boolean compare(Box box) {
//        return this.getWeight(this.boxAL.size(), this.obj) == box.getWeight(box.boxAL.size(), box.obj);
//    }

//    private float getWeight(int quantity, T obj) {
//        return quantity * obj.getWeigth();
//    }

    void addFruit(Box box, int quantity) {
        if (this.obj.getClass() == obj.getClass()) {
            for (int i = 0; i < quantity; i++) {
                this.boxAL.add(this.obj);
            }
        } else {
            System.out.println("Смешивать фрукты нельзя!");
        }
    }

    void pourFruit(Box box) {
        if (this.obj.getClass() == box.obj.getClass()) {
            this.boxAL.addAll(box.boxAL);
        } else {
            System.out.println("Смешивать фрукты нельзя!");
        }
    }
}