package homework5;

import static homework5.MainClass.*;

public class Car implements Runnable {
    private static int carsCount = 0;
    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        carsCount++;
        this.name = "Участник #" + carsCount;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(100 + (int) (Math.random() * 100));
            System.out.println(this.name + " готов");
            cdlPrep.countDown();
            cdlStart.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
//        System.out.println(this.name + " " + cdlFinish.getCount());
        if (cdlFinish.getCount() == CARS_COUNT) {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> " + this.name + " WINNER!!!");
        }

        cdlFinish.countDown();
    }
}