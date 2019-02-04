package warehouse;

public class App {
    public static void main(String[] args) {
        Box<Fruit> box = new Box<>();
        Box<Fruit.Apple> boxApple = new Box<>();
        Box<Fruit.Orange> boxOrange = new Box<>();
        boxApple.addFruit(new Fruit.Apple());
        boxApple.pourFruit(box);
        boxOrange.addFruit(new Fruit.Orange());
        System.out.println(boxOrange.getWeight());
    }
}
