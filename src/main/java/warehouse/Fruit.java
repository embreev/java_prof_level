package warehouse;

abstract class Fruit {
    private float weight;

    public abstract Fruit newInstance();

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    static class Apple extends Fruit {
        public Fruit newInstance() {
            return new Apple();
        }

        public Apple() {
            super(1.0f);
        }
    }

    static class Orange extends Fruit {
        public Fruit newInstance() {
            return new Orange();
        }

        public Orange() {
            super(1.5f);
        }
    }

}
