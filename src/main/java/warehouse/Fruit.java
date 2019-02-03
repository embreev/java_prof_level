package warehouse;

public class Fruit<T> {
    private float weigth;
    private T obj;

    public Fruit(float weigth) {
        this.weigth = weigth;
    }

    public float getWeigth() {
        return weigth;
    }

public static class Apple extends Fruit{
    public Apple(float weigth) {
        super(weigth);
    }
}

public static class Orange extends Fruit {
    public Orange(float weigth) {
        super(weigth);
    }
}

}
